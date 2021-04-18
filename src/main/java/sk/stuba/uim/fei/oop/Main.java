package sk.stuba.uim.fei.oop;

import java.awt.*;
import javax.swing.*;
public class Main extends JFrame {
    public static void main(String[] args){
        new Main();
    }

    public Main() throws HeadlessException{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,200);
        this.setVisible(true);
        var canvas = new MyFakeCanvas();
        this.add(canvas);
    }
}
