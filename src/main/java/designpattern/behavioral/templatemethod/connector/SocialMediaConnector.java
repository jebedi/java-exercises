package designpattern.behavioral.templatemethod.connector;

public interface SocialMediaConnector {
    default void post(String text) {
        if(isLoggedIn()){
            sendData(text);
        } else {
            System.out.println("Failed logging in");
        }
    }

    boolean isLoggedIn();

    boolean logIn(String username, String password);

    void sendData(String text);
}
