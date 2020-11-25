package designpattern.behavioral.templatemethod.connector;

public class TwitterConnector implements SocialMediaConnector {
    private boolean loggedIn;

    public TwitterConnector() {
        loggedIn = false;
    }

    @Override
    public boolean isLoggedIn() {
        return loggedIn;
    }

    @Override
    public boolean logIn(String username, String password) {
        // call Twitter authentication
        loggedIn = true;
        return loggedIn;
    }

    @Override
    public void sendData(String text) {
        System.out.println("Sent to Twitter: " + text);
    }
}
