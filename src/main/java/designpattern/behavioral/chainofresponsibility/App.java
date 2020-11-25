package designpattern.behavioral.chainofresponsibility;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.consoleLogger(Logger.LogLevel.DEBUG, Logger.LogLevel.WARNING)
                .appendNext(Logger.emailLogger(Logger.LogLevel.ERROR))
                .appendNext(Logger.fileLogger(Logger.LogLevel.values()));

        logger.log("Test 1", Logger.LogLevel.INFO);
        logger.log("Test 2", Logger.LogLevel.INFO);
        logger.log("Test 3", Logger.LogLevel.DEBUG);
        logger.log("Test 4", Logger.LogLevel.ERROR);
        logger.log("Test 5", Logger.LogLevel.WARNING);
        logger.log("Test 6", Logger.LogLevel.INFO);
    }
}
