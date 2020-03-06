package Circles;

import java.awt.*;

public class BackgroundColor {
    private MainClass controller;
   // MainCanvas mainCanvas = new MainCanvas(this.controller);
  //  private float deltaOfTme= System.nanoTime()* 0.000000001f; //mainCanvas.getDeltaTime(); //System.nanoTime() * 0.000000001f ;
    private float deltaOfTme = (float) Math.random()* 60;
    //private float red = 1 * deltaOfTme ;
    private float red =  deltaOfTme ;
   // private float green = 1 * deltaOfTme;
    private float green =  deltaOfTme;
   // private float blue = 1 * deltaOfTme;
    private float blue =  deltaOfTme;
    private final int arrayChanger[] = new int[255];

   public float getRed(){return red;}
    public float getRGreen(){return green;}
    public float getBlue(){return blue;}

    private float redMath = (float)(Math.random() * 255);
    private float greenMath = (float)(Math.random() * 255);
    private float blueMath = (float)(Math.random() * 255);

    public float setRed(float red){             // setting boundaries for random color with time;
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
   // public Color colorBack = Color.getHSBColor(getRed(), getRGreen(), getBlue());
    public Color colorBack = Color.getHSBColor(getRed() * deltaOfTme, getRGreen() * deltaOfTme, getBlue()* deltaOfTme);
    //public Color colorBackGroundMath = Color.getHSBColor(redMath, greenMath, blueMath);
    public Color colorBackGroundMath = Color.getHSBColor(redMath * deltaOfTme, greenMath * deltaOfTme, blueMath * deltaOfTme);
  //  public Color colorBack = Color.getHSBColor( setRed(getRed()), setGreen(getRGreen()), setBlue(getBlue()));

   public Color getColorBack(){return colorBack;}
public Color getColorBackGroundMath(){return colorBackGroundMath;}

   // public void CanvasBackground (MainCanvas canvas, Color colorBack){
        public void CanvasBackground (MainCanvas canvas, Color colorBackGroundMath){
       do {
           canvas.setBackground(colorBackGroundMath );
           canvas.repaint();
       //    return colorBack;
       } while(true);
    }

    public void arrayChangingOfCanvas (MainCanvas canvas, Color colorBackGroundMath){
       for(int i = 0; i < arrayChanger.length; i++){
           canvas.setBackground(colorBackGroundMath);
           canvas.repaint();
       }

    }

}
