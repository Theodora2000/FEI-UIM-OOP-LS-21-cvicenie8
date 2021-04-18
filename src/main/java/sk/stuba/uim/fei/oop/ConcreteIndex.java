package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIndex extends Generic<Character, Message> {



    public void add(Message m){
        this.put(m.getContent().charAt(0),m);
        }

        public String toString(){
        StringBuilder builder = new StringBuilder();
        for(var entry : this.index.entrySet()){
            builder.append("----------------------------\n");
            builder.append("Key: " +entry.getKey()+"\n");
            for(Message m : entry.getValue()){
                builder.append("Message:" + m.getContent()+"\n");
            }
        }
        return builder.toString();
        }
    }

