package designpattern.behavioral.templatemethod.connector;

public class FacebookConnector implements SocialMediaConnector {
    private boolean loggedIn;

    public FacebookConnector() {
        this.loggedIn = false;
    }

    @Override
    public boolean isLoggedIn() {
        return loggedIn;
    }

    @Override
    public boolean logIn(String username, String password) {
        //call facebook authentication
        loggedIn = true;
        return loggedIn;
    }

    @Override
    public void sendData(String text) {
        System.out.println("Sent to facebook: " + text);
    }
}
