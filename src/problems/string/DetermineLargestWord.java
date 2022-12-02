package problems.string;

public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */
    static int longestWordLength(String str)
    {
        String[] words = str.split(" ");
        int length = 0;
        String longest = null;
        for(String word:words){
            if(length < word.length()){
                length = word.length();
                longest = word;
            }
        }
        System.out.println(longest);
        return length;
    }
    public static void main(String[] args) {

        String str = "Human brain is a biological learning machine";
        System.out.println(longestWordLength(str));
        //write your code here

    }

}
