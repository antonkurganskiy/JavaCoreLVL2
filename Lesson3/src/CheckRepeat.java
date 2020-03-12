import java.util.ArrayList;
import java.util.HashMap;

public class CheckRepeat {
    private static  int bufferNumber =0;
    public static  void checkRepeat(ArrayList<String> arrayList, HashMap<Integer, String> hm) {
        String bufferWord;

        System.out.println(hm.size());
        for (int i =0; i < hm.size(); i++){
            bufferWord = hm.get(i);
            for(int j = 0; j < hm.size(); j++)
            if (hm.get(j) == bufferWord){
          //  if (hm.entrySet().contains(bufferWord)){                                  //!!!Doesn't work;
                bufferNumber ++;
            }
            System.out.println("Word " + bufferWord + " repeats " + bufferNumber + " times.");
            bufferNumber=0;
        }

        /** Test code block
         * Here will be trying to create code which prints only unique words;
         *
        for (int i = 0; i < arrayList.size(); i++) {                                              //Loop to go through ArrayList;
            bufferWord = arrayList.get(i);
         //   System.out.println(bufferWord.hashCode());                                             // test row (to check data;
         //  System.out.println(arrayList.get(i).hashCode());                                         // test row (to check data;
            for (int j = 0; j < arrayList.size(); j++){                                           //loop for checking all array with our buffer word;
         //       if ( !arrayList.equals(bufferWord) && i != j){                                        // !!!Doesn't work: Prints all repeating words;
           //         if ( arrayList.contains(bufferWord) && i != j){                                   // !!!Doesn't work: Prints all repeating words;
                //      if (bufferWord != arrayList.forEach(arrayList.get(j)) && i != j){               // ??? Check wtf with .get method!;
                        if ( bufferWord.hashCode() != arrayList.get(j).hashCode() && i != j){      // !!!Doesn't work: Prints all repeating words;
                    System.out.println(bufferWord);
                }
        }
    } */

        /**Test code block
         * Here will be trying to create code which remove repeating words;
         *
         * It's work;
         * */
        for (int i = 0; i < arrayList.size(); i++) {                                              //Loop to go through ArrayList;
            bufferWord = arrayList.get(i);
            for (int j = 0; j < arrayList.size(); j++) {                                           //loop for checking all array with our buffer word;
                if (bufferWord == arrayList.get(j) && i != j) {
                   arrayList.remove(j);
                }
            }
        }


    }
}
