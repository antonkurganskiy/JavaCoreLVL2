import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lesson3 {
    public static ArrayList <String> wordsCountingList = new ArrayList<>();
    public static HashMap<Integer, String> hm = new HashMap<>();

    public static void main(String[] args) {


        /**Test code block;
         *
         * 12.03.20 Trying to apply this method for file reader;
         * */
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
        System.out.println("Our initial array of words ");
        System.out.println(wordsCountingList);
        System.out.println("After adding it into HashMap we have this keys and values ");
        System.out.println(Arrays.asList(hm));                                                    //??? 12.03.20 Where he hide half of words???
        System.out.println("Function which counts quantity of repeating and deleting it in work looks like that : ");
        CheckRepeat.checkRepeat(wordsCountingList, hm, wordsArray);
        System.out.println(wordsCountingList);
        PhoneBook.phoneBook();
     //   System.out.println(PhoneBook.getBook());
        PhoneBook.searchByNumber(hm);
    }

    public static void putArrayIntoArrayList(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            wordsCountingList.add(strings[i]);
            hm.put( i, strings[i]);
        }
    }

    }


