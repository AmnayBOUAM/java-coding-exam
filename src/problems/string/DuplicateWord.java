package problems.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */
        static void duplicatWord(String sentence){
            String[] words = sentence.split("[ \\.\\,]");
            int duplicate;
            int lengthWord = 0;
            int countDuplicate =0;
            int sum = 0;

            for (int i = 0; i < words.length; i++){
               duplicate= 1;
                for (int j = i+1; j < words.length; j++){
                    if(words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")){
                      duplicate++;
                      words[j]="DUPLICATE!!!";
                    }

                }
                if (duplicate>1 && !words[i].equals("DUPLICATE!!!")){
                    lengthWord = words[i].length();
                    sum = sum+(lengthWord*duplicate);
                    countDuplicate= countDuplicate+duplicate;
                    System.out.println("* the word "+ "<<"+words[i]+">>"+" is duplicated "+ duplicate +" times");
                }
            }
            double averageLength = (sum/countDuplicate);
            System.out.println("the average length of the words is : "+(averageLength) );

        }
    public static void main(String[] args) {
        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";
        duplicatWord(str);
        //run your code here
    }

}
