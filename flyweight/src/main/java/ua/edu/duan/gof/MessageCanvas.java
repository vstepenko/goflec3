package ua.edu.duan.gof;

public class MessageCanvas {

    private final String login;

    private final String largeLoginIcon;

    private final String frame;

    public MessageCanvas(String login, String largeLoginIcon, String frame) {
        this.login = login;
        this.largeLoginIcon = largeLoginIcon;
        this.frame = frame;
    }

    public String getLogin() {
        return login;
    }

    public String getLargeLoginIcon() {
        return largeLoginIcon;
    }


    public String getFrame() {
        return frame;
    }



}
