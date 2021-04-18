package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcreteIndex {

    private Map<Character, List<Message>> index;

    public ConcreteIndex(){
        this.index = new HashMap<>();
    }


    public void add(Message m){
        Character firstChar = m.getContent().charAt(0);
        if (this.index.containsKey(firstChar)) {
        this.index.get(firstChar);
        }else{
            List<Message> newList = new ArrayList<>();
            newList.add(m);
            this.index.put(firstChar, newList);
        }
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

