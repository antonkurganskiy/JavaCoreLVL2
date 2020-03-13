import java.util.HashMap;
import java.util.Scanner;

public class Person {
    public static Scanner scanner = new Scanner(System.in);
    protected static HashMap <String, String> personData = new HashMap<>();
    public static  HashMap person(String name, String number, String email){
        personData.put("7999444333", "email1");
        personData.put("7999333222", "email2");
        personData.put("7999222111", "email1");
        personData.put("7999111000", "email0");
        return personData;
    }
    public static String addingPersonName(){
        System.out.println("Type person name ");
        String name = scanner.nextLine();
        return name;
    }

    public static HashMap addingPeoplesData (){
        System.out.println("Type person number");
        String number = scanner.nextLine();
        System.out.println("Type person email");
        String email = scanner.nextLine();
        personData.put(number, email);
        return personData;
    }
}
