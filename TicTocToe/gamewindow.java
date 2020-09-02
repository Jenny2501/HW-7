package ru.geekbrains.j_one.lesson_a.online.TicTocToe;

import javax.swing.*;
import java.awt.*;

public class gamewindow extends JFrame {
    private static final int WIN_WIDTH = 400;
    private static final int WIN_HEIGHT = 440;
    private static final int WIN_POSX = 550;
    private static final int WIN_POSY =350;

   private Map map;

    gamewindow () {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize ( WIN_HEIGHT, WIN_WIDTH);
        setLocation (WIN_POSX, WIN_POSY);
        setTitle("TicTocToe");
        setResizable (false);
        JButton btnStart = new JButton ("Start a new button");
        JButton btnExit = new JButton ("Exit");
        JPanel panelButton = new JPanel (GridLayout (3,2));
        map = new Map();

};


        panelButton.add (btnStart);
        panelButton.add (btnExit);
        add (panelButton, BorderLayout.CENTER);
        add (map, BorderLayout.SOUTH);


        setVisible (true);
    }
}
    void applySettings ( int mode, int size, int len){
    map.StartNewGame( mode,size,size,len)
    }
}