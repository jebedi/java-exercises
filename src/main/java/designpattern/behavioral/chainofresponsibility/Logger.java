package designpattern.behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Consumer;

@FunctionalInterface
public interface Logger {
    enum LogLevel {
        INFO, DEBUG, WARNING, ERROR
    }

    boolean log(String message, LogLevel severity);

    default Logger appendNext(Logger nextLogger) {
        return (msg, sev) -> {
            boolean handled = log(msg, sev);
            if (!handled) {
                handled = nextLogger.log(msg, sev);
            }

            return handled;
        };
    }

    static Logger createLogger(LogLevel[] levels, Consumer<String> consumer) {
        Set<LogLevel> logLevels = EnumSet.copyOf(Arrays.asList(levels));
        return (msg, sev) -> {
            if (logLevels.contains(sev)) {
                consumer.accept(msg);

                return true;
            }

            return false;
        };
    }

    static Logger consoleLogger(LogLevel... levels) {
        return createLogger(levels, msg -> System.out.println("Writing to console: " + msg));
    }

    static Logger emailLogger(LogLevel... levels) {
        return createLogger(levels, msg -> System.out.println("Sending email: " + msg));
    }

    static Logger fileLogger(LogLevel... levels) {
        return createLogger(levels, msg -> System.out.println("Writing to file: " + msg));
    }
}

