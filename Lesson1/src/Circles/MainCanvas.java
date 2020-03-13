package Circles;

import javax.swing.*;
import java.awt.*;

public class MainCanvas extends JPanel {
    long lastFrameTime;
    private float deltaTime;
    private final MainClass controller;                         // as far as i understood - this is refer as a link with our main class, to create actions;
    BackgroundColor backgroundColor = new BackgroundColor();

    MainCanvas(MainClass controller) {                          //Constructor of our Canvas;
        lastFrameTime = System.nanoTime();
        this.controller = controller;
        this.setBackground(backgroundColor.CanvasBackground(this,deltaTime));
    }
    @Override
    protected void paintComponent(Graphics g) {                             // calling parent constructor from library;
        super.paintComponent(g);

        long currentTime = System.nanoTime();
         deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        controller.onCanvasRepainted(this, g, deltaTime);
        try {                                                              // Catching potential problems;
            Thread.sleep(16);                                       // setting delay to make life of CPU easier;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lastFrameTime = currentTime;
        repaint();
    }


    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }
    public float getDeltaTime() { return deltaTime;}
}

