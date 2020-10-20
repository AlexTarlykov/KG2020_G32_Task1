package com.company;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 800);
        setResizable(false);
        add(new DrawPanel());
        setVisible(true);
    }
}
