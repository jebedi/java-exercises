package designpattern.behavioral.mediator;

public class App {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        ChatParticipant p1 = new ChatParticipant("Jedrzej", chatRoom);
        ChatParticipant p2 = new ChatParticipant("Adam", chatRoom);
        ChatParticipant p3 = new ChatParticipant("Wojtek", chatRoom);
        ChatParticipant p4 = new ChatParticipant("Michal", chatRoom);
        ChatParticipant p5 = new ChatParticipant("Marcin", chatRoom);

        chatRoom.userJoined(p1);
        chatRoom.userJoined(p2);
        chatRoom.userJoined(p3);
        chatRoom.userJoined(p4);
        chatRoom.userJoined(p5);

        p1.sendMessage("No heyka");
        p2.sendMessage("siemanko");
    }
}
