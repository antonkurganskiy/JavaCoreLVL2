package Circles;

import java.awt.*;

public class BackgroundColor {
    private MainClass controller;
   // MainCanvas mainCanvas = new MainCanvas(this.controller);
    private float deltaOfTme= System.nanoTime()* 0.000000001f; //mainCanvas.getDeltaTime(); //System.nanoTime() * 0.000000001f ;
    //private float red = 1 * deltaOfTme ;
    private float red =  deltaOfTme ;
   // private float green = 1 * deltaOfTme;
    private float green =  deltaOfTme;
   // private float blue = 1 * deltaOfTme;
    private float blue =  deltaOfTme;

   public float getRed(){return red;}
    public float getRGreen(){return green;}
    public float getBlue(){return blue;}

    public float setRed(float red){
        if (red > 0 && red < 255) {
            this.red = red;
        }else {
            red = 0;
        }
        return red;
    }
    public float setBlue(float blue){
        if (blue > 0 && blue < 255) {
            this.blue = blue;
        }else {
            blue = 0;
        }
        return blue;
    }
    public  float setGreen(float green){
        if (green> 0 && green < 255) {
            this.green= green;
        }else {
            green = 0;
        }
        return green;
    }
    public Color colorBack = Color.getHSBColor(getRed(), getRGreen(), getBlue());
  //  public Color colorBack = Color.getHSBColor( setRed(getRed()), setGreen(getRGreen()), setBlue(getBlue()));

   public Color getColorBack(){return colorBack;}

    public void CanvasBackground (MainCanvas canvas, Color colorBack){
       do {
           canvas.setBackground(colorBack);
           canvas.repaint();
       //    return colorBack;
       } while(true);

    }
}
