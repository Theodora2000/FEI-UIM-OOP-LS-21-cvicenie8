package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        ArrayList<Message> messages = new ArrayList<>();
        messages.add(new Message("hello"));
        messages.add(new Message("world"));

        for(Message m : messages){
            System.out.println(m.getContent());
        }
       ConcreteIndex concreteIndex = new ConcreteIndex();
        concreteIndex.add(new Message("hello"));
        concreteIndex.add(new Message("world"));
        concreteIndex.add(new Message("hello world"));
        System.out.println(concreteIndex.toString());
    }
}
