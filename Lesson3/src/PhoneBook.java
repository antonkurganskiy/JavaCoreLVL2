import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static ArrayList<String> emails = new ArrayList<>();
    private static HashMap<String , HashMap> book = new HashMap();
    private static HashMap<ArrayList<Integer> , ArrayList<String>> numberEmailList = new HashMap();
    private static Scanner scanner = new Scanner(System.in);
    public static void phoneBook(){
       /* for(int i =0; i<numberEmailList.size(); i++){
            numberEmailList.put(numbers.toArray()[i], emails.toArray()[i]);
        }*/
      // numberEmailList.forEach(numberEmailList.put(numbers,emails));
        System.out.println(" How many people you want to put into your phone book?");
        int quantityOfPeoples = scanner.nextInt();
        for(int i = 0; i < quantityOfPeoples; i++) {
            book.put(Person.addingPersonName(), Person.addingPeoplesData());
        }
        }
        public static HashMap getBook(){return book;}

        public static ArrayList searchByNumber(HashMap hm){
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<String> arrayOfPhones = new ArrayList<>();
            System.out.println("Type name of person which you are searching for :");
            String nameSearch = scanner2.nextLine();                       //13.03.20 added new scanner - started working  //13.03.20??? why it doesn't wait???;
            for (int i = 0; i< hm.size(); i++){
             //   if(hm.get(i) == nameSearch){
                if (hm.containsKey("="+nameSearch)){                            // 13.03.20 Doesn't work!;
                    System.out.println(" this name exist! ");               //test row;
                 //   arrayOfPhones.add(hm.values(hm.get(i)));
               //     arrayOfPhones.add(hm.toString(hm.get(i)));
                    System.out.println(hm.get(i));
                }else {
                    System.out.println("We didn't find this person in this phone book2");
                }
            }
        return arrayOfPhones;
        }
    }

