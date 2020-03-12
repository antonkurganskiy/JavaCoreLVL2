import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lesson3 {
    public static ArrayList <String> wordsCountingList = new ArrayList<>();
    public static HashMap<Integer, String> hm = new HashMap<>();

    public static void main(String[] args) {

   /*     try {
        FileInputStream fis = new FileInputStream("FileForInputWords.txt");
        String string ;
        File file = new File("C:\\Learning IT\\Java\\JavaLvl2\\Lesson3\\FileForInputWords.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        System.out.println();
            while ((string = bufferedReader.readLine()) != null){
              if ( bufferedReader.readLine() == "."){System.out.println("\n");}
                System.out.println(string);}
        } catch (IOException e){
            e.printStackTrace();
   */
    String[] wordsArray = {"distributed ","energy ","is ","as ","increased ","energy ","be ","distributed ","is ","transformer ","This ","allows ","energy ","the ","wire ","is ","as ","distributed ","formula ","the ","high ","through ","energy ","lines ","the ","voltage ","because ","as ","energy ",};
    //ArrayList<String> wordsCountingList = new ArrayList<>();
   /* for (int i = 0; i < wordsArray.length; i++) {
                wordsCountingList.add(wordsArray[i]);
        }*/
        putArrayIntoArrayList(wordsArray);
        System.out.println(wordsCountingList);
        System.out.println(Arrays.asList(hm));                                                    //??? Where he hide half of words???
        CheckRepeat.checkRepeat(wordsCountingList, hm);
        System.out.println(wordsCountingList);

    }

    public static void putArrayIntoArrayList(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            wordsCountingList.add(strings[i]);
            hm.put( i, strings[i]);
        }
    }

    }


