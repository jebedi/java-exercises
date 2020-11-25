package designpattern.behavioral.mediator;

public class ChatParticipant {
    private final String username;
    private final ChatMediator chatRoom;

    public ChatParticipant(String username, ChatMediator chatRoom) {
        this.username = username;
        this.chatRoom = chatRoom;
    }

    public String getUsername() {
        return username;
    }

    void sendMessage(String message) {
        System.out.println(">" + username + ": " + message);
        chatRoom.sendMessage(message, username);
    }

    void receiveMessage(String message, String user) {
        System.out.println("|" + username + "|" + user + ":" + message);
    }
}
