package Lesson2;

public class BoundriesCheck {
    Changer changer = new Changer();
    public static void boundriesCheck(String[][] str){
      try{
          //changer(str);
      }catch (ArrayIndexOutOfBoundsException arrBound){
          arrBound.printStackTrace();
      }
    }
}
