package designpattern.behavioral.templatemethod;

import designpattern.behavioral.templatemethod.connector.FacebookConnector;
import designpattern.behavioral.templatemethod.connector.SocialMediaConnector;
import designpattern.behavioral.templatemethod.connector.TwitterConnector;

public class App {
    public static void main(String[] args) {
        SocialMediaConnector facebook = new FacebookConnector();
        SocialMediaConnector twitter = new TwitterConnector();

        facebook.post("hello World!");
        facebook.logIn("test", "test");
        facebook.post("hello World!");

        twitter.post("hello World!");
        twitter.logIn("test", "test");
        twitter.post("hello World!");
    }
}
