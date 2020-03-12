import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static ArrayList<String> emails = new ArrayList<>();
    private static HashMap<String , HashMap> book = new HashMap();
    private static HashMap<ArrayList<Integer> , ArrayList<String>> numberEmailList = new HashMap();
    public static void phoneBook(){
        numbers.add(7999444);
        numbers.add(8555677);
        numbers.add(9999999);
        emails.add("email1");
        emails.add("email2");
        emails.add("email3");
       /* for(int i =0; i<numberEmailList.size(); i++){
            numberEmailList.put(numbers.toArray()[i], emails.toArray()[i]);
        }*/
       numberEmailList.forEach(numberEmailList.put(numbers,emails));
        book.put("Ivanov", numberEmailList);
        book.put("Sidorov", numberEmailList);


    }
}
