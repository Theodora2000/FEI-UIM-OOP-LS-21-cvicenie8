package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class MyFakeCanvas extends JPanel implements MouseListener {

    private List<Rectangle> rects;

    public MyFakeCanvas(){
        this.rects = new ArrayList<>();
        this.addMouseListener(this);
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(50,50,100,100);
        g.setColor(Color.red);
        for(var rect: this.rects){
            g.fillRect(rect.x, rect.y, rect.width, rect.height);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    this.rects.add(new Rectangle(e.getX()-10, e.getY()-10,20,20));
    this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
