package Lesson2;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;

public class Changer {

    protected static String arr[][] = new String[4][4];
    protected static int[] numbersArray = new int[20];

    //  public String[][] changer(String str, String[][] arr){
    //  public static String[][] changer(String str){
    public static void changer(String str) {
        int j = 0;
        BufferedReader reader = new BufferedReader(new StringReader(str));
        ArrayList<String> arrayOfNumbers = new ArrayList<String>();
        //Summator summator = new Summator(str);
        //  String arrayOfNumbers [] = new String[30];
        // for (int a=0; a < arrayOfNumbers.length; a++)
/*        try {
            for (int i = 0; i < arr.length; i++) {
                for (j = 0; j < arr.length; j++) {
              //      arr[i][j] = reader.readLine().trim().split("\\s+"));
                }
           // arrayOfNumbers.add(reader.readLine().trim().split("\\s+"));
        } }
        catch (IIOException e) {
            e.printStackTrace();
        }*/
    }
}
       /* for (int i =0; i < arr.length; i++){                    // adding to array string values, i hope;
            for (j =0; j<arr.length;){
                if (arr[i][j] != " ") {
                   //  arrayOfNumbers[a]= (String) reader.readLine(str);
                   // arrayOfNumbers.add(str);// = reader.readLine(str);
                  //  arrayOfNumbers[a] = arr[i][j];
                      arr[i][j] = str;}
*/
        /*        else if( arr[i][j].equals("\n") ){
                    j++;
                }*/
             //   if(arr[i][j].equals('/n')){j++;}
             /*   if(arr[i][j].equals("/n")){
                    j++;
                }else {
                    arrayOfNumbers.add(str);
                    arr[i][j] = str;
                }*/
/*            }
        }*/
/*        for (int a=0; a <numbersArray.length; a++) {
            for (int i = 0; i < arr.length; i++) {
                for (j = 0; j < arr.length; j++) {
                //    numbersArray[a] = Integer.parseInt(arr[i][j]);
               //     numbersArray[a] = Integer.valueOf(arr[i][j]);
                    System.out.print(arr[i][j]);
                  //  numbersArray[a] = (int) arr[i][j];
                    System.out.print(numbersArray[a] + " "); // test that it writes correctly to array;
                }
            }
        }*/
       // return arr;
/*
    }
}
*/
