package Circles;

import java.awt.*;

public class BackgroundColor {
    private float deltaOfTme ;
    private float red = 1 * deltaOfTme;
    private float green = 1 * deltaOfTme;
    private float blue = 1 * deltaOfTme;

   public float getRed(){return red;}
    public float getRGreen(){return green;}
    public float getBlue(){return blue;}

    public void setRed(float red){
        if (red > 0 && red < 255) {
            this.red = red;
        }else {
            red = 0;
        }
    }
    public void setBlue(float blue){
        if (blue > 0 && blue < 255) {
            this.blue = blue;
        }else {
            blue = 0;
        }
    }
    public void setGreen(float green){
        if (green> 0 && green < 255) {
            this.green= green;
        }else {
            green = 0;
        }
    }

    public Color colorBack = Color.getHSBColor(red, green, blue);

    public Color CanvasBackground (MainCanvas canvas, float getDeltaTime){
        canvas.setBackground(colorBack);
        return colorBack;
    }

}
