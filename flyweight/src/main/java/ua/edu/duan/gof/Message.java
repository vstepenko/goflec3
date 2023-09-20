package ua.edu.duan.gof;

public class Message {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCanvas(MessageCanvas canvas) {
        this.canvas = canvas;
    }

    private String message;

    public Message(String message, String login) {
        this.message = message;
        this.canvas = MessageCanvasFactory.getInstance().getCanvas(login);
    }

    private MessageCanvas canvas;


    public MessageCanvas getCanvas() {
        return canvas;
    }

    public void setCanvas(String login) {
        this.canvas = MessageCanvasFactory.getInstance().getCanvas(login);
    }

}
