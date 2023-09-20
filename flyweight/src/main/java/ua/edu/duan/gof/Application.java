package ua.edu.duan.gof;

public class Application {

    public static void main(String[] args) {

        Message[] messages = { new Message("Hello", "Bob"), new Message( "Message1" , "Tom"),
        new Message("Message 2" ,"Bob")};

        for(Message message : messages){

            System.out.println( "login: " + message.getCanvas().getLogin() + " icon " +  message.getCanvas().getLargeLoginIcon() + " frame " + message.getCanvas().getFrame()
            + " message " + message.getMessage());
        }

    }
}
