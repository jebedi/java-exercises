package designpattern.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements ChatMediator {
    Map<String, ChatParticipant> users;

    public ChatRoom() {
        this.users = new HashMap<>();
    }

    @Override
    public void sendMessage(String message, String username) {
        users.values().stream()
                .filter(user -> !user.getUsername().equals(username))
                .forEach(user -> user.receiveMessage(message, username));
    }

    @Override
    public void userJoined(ChatParticipant user) {
        users.put(user.getUsername(), user);
    }

    @Override
    public void userLeft(String username) {
        users.remove(username);
    }
}
