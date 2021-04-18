package sk.stuba.uim.fei.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){

       Generic<Character, Message>concreteIndex = new Generic<>();
       var old = concreteIndex.put('w', new Message("world"));
        System.out.println(old);
        old = concreteIndex.put('h', new Message("hello world"));
        System.out.println(old);
        old = concreteIndex.put('h', new Message("hello"));
        System.out.println(old);
    }
}
