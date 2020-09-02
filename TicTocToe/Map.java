package ru.geekbrains.j_one.lesson_a.online.TicTocToe;

import javafx.scene.paint.Color;

import javax.swing.*;

public class Map extends JPanel {
    public static final int MODE_HVH=0;
    public static final int MODE_HVA=1;

    Map(){
        setBackground(Color.AQUA);
    }
void StartNewGame(int gameMod, int fieldSizeX, int fieldSizeY,int winLength){
        System.out.printf("mod:%d, size: %d, length:%d\n", gameMod, fieldSizeX,winLength);
}
}
