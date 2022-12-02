package problems.string;

public class Permutation {

    /*
     *
     * permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * write Java program to compute all permutation of a String
     *
     */
    static void permutation (String str, String string) {

        //while (stR.length() != 0) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String str1 = str.substring(0, i);
                String str2 = str.substring(i + 1);
                String stR = str1 + str2;
                String result = string + ch;
                System.out.println(">"+stR);
                System.out.println(result);
               // permutation(stR, result);
            }
            if (str.length() == 0) {

                System.out.print("<<" + string + ">>");
            }
        //}
    }
    public static void main(String[] args) {

        String str ="ABC";
        String string ="";

        permutation(str, string);


        //run your code here


    }
}
