package problems.string;

import java.util.Scanner;

public class Palindrome {

    /*
     *
     * write java code to check if a given String is Palindrome
     * when a String is reversed and remains unchanged, that is called Palindrome
     * example, MOM,DAD,MADAM,KAYAK
     *
     */
    static void palindrome(String str){
        String purlStr="";
        for (int i = str.length()-1; i >= 0 ;i--){
            purlStr += str.charAt(i);
        }
        if (purlStr.equalsIgnoreCase(str)){
            System.out.println(str+" is a Palindrome");
        }
        else {
            System.out.println(str+" is not a Palindrome");
        }
    }
    public static void main(String[] args) {

        //write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string to check if is a palindrome");
        System.out.print(">");
        String str = scanner.nextLine();
        palindrome(str);
    }
}
