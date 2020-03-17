package Lesson2;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class Lesson2 {
    protected static String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
    protected  static  String arr1 [][]= new String[4][4];
    public static void main(String[] args) {
        //Changer changer = new Changer();
      //  BoundriesCheck boundriesCheck = new BoundriesCheck(arr1);
        try {
            System.out.println(str);   // initial string;

            //Test Block (p.s. - don't let that toxic code to escape!)
            Summator.summator(str);
            Changer changer = new Changer();

        }catch (ArrayIndexOutOfBoundsException arrayOut){
            arrayOut.printStackTrace();
        } catch (ArrayStoreException arrayStorage){
            arrayStorage.printStackTrace();}
     /*   } catch (IOException e){
            e.printStackTrace();
        }*/
//       arr1 = arr1.changer(str);
  /*      try {
            Changer.changer(str);
        }catch (IIOException e){e.printStackTrace();}*/
     /*   int j = 0;
        BufferedReader reader = new BufferedReader(new StringReader(str));
        ArrayList<String> arrayOfNumbers = new ArrayList<String>();
        for (int i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1.length; ) {
                arrayOfNumbers.add(str);
                arr1[i][j] = str;
                if (arr1[i][j].equals("/n")) {
                    j++;
                }
            }
        }*/
    /*    for (int i =0; i < arr1.length; i++){
            for (int j =0; j<arr1.length;){
                System.out.print(arr1[i][j]);
            }
        }*/
    }
    public static  int getStringLength(String str){return (int) str.length();}
}
