package ua.edu.duan.gof;

import java.util.HashMap;
import java.util.Map;

public class MessageCanvasFactory {

    private static final MessageCanvasFactory instance = new MessageCanvasFactory();

    public static MessageCanvasFactory  getInstance(){
        return instance;
    }

    private Map<String, MessageCanvas>  messageCanvasMap = new HashMap<>();

    public MessageCanvas getCanvas(String login) {
       if(!messageCanvasMap.containsKey(login)){
           messageCanvasMap.put(login, loadFromDB(login));
       }
       return messageCanvasMap.get(login);
    }

    private MessageCanvas loadFromDB(String login) {

        System.out.println("Load Canvas from DB");
        MessageCanvas canvas = new MessageCanvas(login, "Icon for "+ login, "Frame for " + login);
        return canvas;
    }
}
