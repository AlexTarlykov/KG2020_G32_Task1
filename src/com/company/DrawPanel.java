package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(100, 170, 255));
        g.fillRect(0, 0, 800, 600);
        g.setColor(new Color(100, 255, 100));
        g.fillRect(0, 600, 800, 200);
        Rhino rhino = new Rhino(600, 300, 100, 300);
        rhino.draw(g);
    }
}
