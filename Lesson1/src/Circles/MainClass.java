package Circles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainClass extends JFrame {

    private static final int POS_X = 400;                               // The window settings;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private int NumberOfBalls = 10;                                     // Integer for changing number of balls on the canvas;
    private Sprite[] sprites = new Sprite[NumberOfBalls];               // Array for balls storage;

    BackgroundColor backgroundColor = new BackgroundColor();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {                     // as i understood from library - this method put run to the end of queue;
            @Override
            public void run() {                                         // Start of our app;
                new MainClass();
            }
        });
    }
    private MainClass(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        // Frame settings;
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Flying balls");
        initApplication();                                              // Calling method which will create our balls;
        MainCanvas canvas = new MainCanvas(this);                       // Creating space where Java will draw;
        add(canvas);
        setVisible(true);
    }
    private void initApplication() {                                    // Method of creating balls on canvas;
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }

    }
    MouseListener mouseListener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (SwingUtilities.isLeftMouseButton(e)){
                NumberOfBalls ++;
            }
             else if (SwingUtilities.isRightMouseButton(e)){
                NumberOfBalls --; }
        }
        @Override
        public void mousePressed(MouseEvent e) { }
        @Override
        public void mouseReleased(MouseEvent e) { }
        @Override
        public void mouseEntered(MouseEvent e) { }
        @Override
        public void mouseExited(MouseEvent e) { }
    };

    public void onCanvasRepainted(MainCanvas canvas, Graphics g, float deltaTime, BackgroundColor backgroundColor) {     //Calling methods which will change the picture on the PC screen;
      //  backgroundColor.CanvasBackground(canvas, backgroundColor.getColorBack());
      //  canvas.setBackground(backgroundColor.getColorBackGroundMath());
        backgroundColor.arrayChangingOfCanvas(canvas, backgroundColor.getColorBackGroundMath());
        canvas.addMouseListener(mouseListener);
        update(canvas, deltaTime);
        render(canvas, g);
    }
    private void update(MainCanvas canvas, float deltaTime) {                           // adding stuff and updating;
      //  canvas.backgroundColor.CanvasBackground(canvas, backgroundColor.getColorBackGroundMath());
       // backgroundColor.arrayChangingOfCanvas(canvas, backgroundColor.getColorBackGroundMath());
       canvas.addMouseListener(mouseListener);
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
            canvas.repaint();
        }
    }
    private void render(MainCanvas canvas, Graphics g) {                                //render of our canvas;
      //  canvas.backgroundColor.CanvasBackground(canvas, backgroundColor.getColorBackGroundMath());
     // backgroundColor.arrayChangingOfCanvas(canvas, backgroundColor.getColorBackGroundMath());
       canvas.addMouseListener(mouseListener);
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
            canvas.repaint();
        }
    }
}




