import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Lesson3 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
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
    ArrayList<String> wordsCountingList = new ArrayList<>();
    for (int i = 0; i < wordsArray.length; i++) {
                wordsCountingList.add(wordsArray[i]);
        }
       // CheckRepeat checkRepeat = new CheckRepeat(wordsCountingList);

    CheckRepeat.checkRepeat(wordsCountingList);
    System.out.println(wordsCountingList);
    }
    }


