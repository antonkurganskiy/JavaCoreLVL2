import java.util.ArrayList;

public class CheckRepeat {

    public static  void checkRepeat(ArrayList<String> arrayList) {
        String bufferWord;
        for (int i = 0; i < arrayList.size(); i++) {                                              //Loop to go through ArrayList;
            bufferWord = arrayList.get(i);
         //   System.out.println(bufferWord.hashCode());                                             // test row (to check data;
         //  System.out.println(arrayList.get(i).hashCode());                                         // test row (to check data;
            for (int j = 0; j < arrayList.size(); j++){                                           //loop for checking all array with our buffer word;
         //       if ( !arrayList.equals(bufferWord) && i != j){                                        // !!!Doesn't work: Prints all repeating words;
           //         if ( arrayList.contains(bufferWord) && i != j){                                   // !!!Doesn't work: Prints all repeating words;
                //      if (bufferWord != arrayList.forEach(arrayList.get(j)) && i != j){
                        if ( bufferWord.hashCode() != arrayList.get(j).hashCode() && i != j){      // !!!Doesn't work: Prints all repeating words;
                    System.out.println(bufferWord);
                }
        }
    }
    }
}
