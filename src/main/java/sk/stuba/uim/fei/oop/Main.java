package sk.stuba.uim.fei.oop;

import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

       IntefaceIndex ci = new IntefaceIndex();
       ci.add(new Message("hello"));
       ci.add(new Message("world"));
        ci.add(new Address("hodzovo nam", "245168"));

        var old = ci.add(new Message("hello world"));

        System.out.println(old);
    }
}
