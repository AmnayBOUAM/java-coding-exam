package problems.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */
    static void wordsAnagram (String str1, String str2 ){
        boolean anagram;
        if (str1.length()==str2.length()){
            char [] array1= str1.toUpperCase().toCharArray();
            char [] array2= str2.toUpperCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            anagram = Arrays.equals(array1,array2);
            if (anagram) System.out.println(str1+" and "+str2+" are anagram");
            else System.out.println(str1+" and "+str2+" are not anagram");
        }else{
            System.out.println(str1+" and "+str2+" are not the same size");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the strings to check if they are anagrams");
        System.out.print("first String >");
        String string1 = scanner.nextLine();
        System.out.println("");
        System.out.print("Second String >");
        String string2 = scanner.nextLine();
        wordsAnagram(string1, string2);
        System.out.println("do you want to try again ? y or n");
        System.out.print(">");
        String tryAgain = scanner.nextLine();
        if (tryAgain.equalsIgnoreCase("y")){
            do{
                System.out.println("enter the strings to check if they are anagrams");
                System.out.print("first String >");
                string1 = scanner.nextLine();
                System.out.println("");
                System.out.print("Second String >");
                string2 = scanner.nextLine();
                wordsAnagram(string1, string2);
                System.out.println("do you want to try again ? y or n");
                System.out.print(">");
                tryAgain = scanner.nextLine();
            }while (tryAgain.equalsIgnoreCase("y"));
        }
        else if (tryAgain.equalsIgnoreCase("n")){
            System.out.println("Good bye");
        }
        else {
            System.out.println("invalid entry");
        }
        //run your code here
    }
}
