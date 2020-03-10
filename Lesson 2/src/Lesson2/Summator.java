package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public class Summator {

    //protected static String arr[][] = new String[4][4];
    //Lesson2 lesson2 = new Lesson2();
   // protected static int arr [] = new int [lesson2.getStringLength];
    protected static int arr [] = new int [16];
   // protected static int[] numbersArray = new int[20];
    private static int resultOfSum = 0;
    private static int result =0;

    public static int summator(String str){
        BufferedReader reader = new BufferedReader(new StringReader(str));
        try {
            String ourLine = reader.readLine();
            String[] lineOfNumbers= new String[4];
            for (int b =0; b < 4; b++)
                (String)lineOfNumbers[b] = ourLine.trim().split("\\s+");
              //  Arrays.toString(lineOfNumbers[b]) = ourLine.trim().split("\\s+");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < lineOfNumbers.length;j++) {
                   //if(lineOfNumbers.equals("\n")){j++;}
                   if(lineOfNumbers.equals("\\s+")){j++;}
                    arr[i] = Integer.parseInt(lineOfNumbers[j]);
                    resultOfSum += arr[i];
                    System.out.println(resultOfSum + " ");

                }
            result= resultOfSum / 2;
            System.out.print(result);
        }
            }
            catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
