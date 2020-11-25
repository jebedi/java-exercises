package designpattern.behavioral.mediator;

public interface ChatMediator {
    void sendMessage(String message, String username);

    void userJoined(ChatParticipant username);

    void userLeft(String username);
}
