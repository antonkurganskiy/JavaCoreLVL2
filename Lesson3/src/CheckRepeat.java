import java.util.ArrayList;
import java.util.HashMap;

public class CheckRepeat {
    private static int bufferNumber = 0;

    public static void checkRepeat(ArrayList<String> arrayList, HashMap<Integer, String> hm, String[] wordsArray) {
        String bufferWord;

        /**Test code block
         *
         * This method will check how many times we meet this word;
         *
         * 12.03.20 method works, but with annoying mistake;
         * 13.03.20 Deleted all repeating words before sending them to Sout and then restore hm for next method;
         */
     //   System.out.println(hm.size());                                //Test row;
        for (int i = 0; i < hm.size(); i++) {
            if (hm.get(i) != null) {
                bufferWord = hm.get(i);
                for (int j = 0; j < hm.size(); j++)
                    if (hm.get(j) == bufferWord && hm.get(j) != null) {
                        //  if (hm.entrySet().contains(bufferWord)){                                  //!!!Doesn't work;
                        bufferNumber++;
                        if (hm.get(j) == null) {
                            hm.remove(j);
                        }
                        hm.remove(j);
                    }
                System.out.println("Word ''" + bufferWord + "'' repeats " + bufferNumber + " times.");  //13.03.20 - delete all repeating words to avoid sending them to sout;//???12.03.20 how exile repeating word from this sout?;
                bufferNumber = 0;
            }
        }
            //12.03.20 That code block didn't stopped annoying repeating;
      /*      if (bufferNumber == 1) {
                System.out.println("Word ''" + bufferWord + "'' repeats " + bufferNumber + " times.");  //??? how exile repeating word from this sout?;
                bufferNumber = 0;
            } else// (int) hm.keySet().toArray()[i] == bufferNumber)
            {
                System.out.println("Word ''" + bufferWord + "'' repeats " + bufferNumber + " times.");  //??? how exile repeating word from this sout?;
                bufferNumber = 0;
          */
        Lesson3.putArrayIntoArrayList(wordsArray); // restoring our HashMap after deleting repeats;
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
        System.out.println("Our HashMap without repeating : ");
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
