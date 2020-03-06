package Circles;

import java.awt.*;

public class Ball extends Sprite {
    private final Color color = new Color(                          //Creating random color for our ball;
            (int) (Math.random() * 255),
            (int) (Math.random() * 255),
            (int) (Math.random() * 255)
    );
    private float vX = (float) (100f + (Math.random() * 200f));     //X Speed settings;
    private float vY = (float) (100f + (Math.random() * 200f));     //Y Speed settings;

    Ball() {
        halfHeight = 20 + (float) (Math.random() * 50f);            //Randomize the size of the ball;
        halfWidth = halfHeight;
    }
    @Override
    public void update(MainCanvas canvas, float deltaTime) {        //Setting the movement action;
        x += vX * deltaTime;
        y += vY * deltaTime;
        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {                       // Changing the direction when hit the wall;
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }

    }
    @Override
    public void render(MainCanvas canvas, Graphics g) {
        g.setColor(color);                                        // Setting color of our ball;
        g.fillOval((int) getLeft(), (int) getTop(),
                (int) getWidth(), (int) getHeight());
    }
}






