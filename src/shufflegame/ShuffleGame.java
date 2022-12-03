package shufflegame;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame implements GameRoadMap{

    Scanner sc = new Scanner(System.in);

    int[] array = {1, 0 ,1};

    /**
     * method that takes an array shuffles the components in random way and returns it
     * @param array: array to shuffle
     * @return array: shuffled array
     */
    public int[] shuffleGame(int[] array) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    /**
     * captures the user input (1, 2 or 3) saves it in an integer variable and returns it
     *
     * @return playerGuess: userInput value
     */
    public int playerGuess() {
        System.out.print(">");
        int userInput = sc.nextInt();
        //implement here
        return (userInput);
    }

    /**
     * checks whether the player guess position is in a correct position in the shuffled array or not
     * and prints the corresponding statements
     * @param shuffledArray: takes the shuffled array
     * @param playerGuess: takes the chosen position user input
     */
    public void checkGuess(int[] shuffledArray, int playerGuess) {
        shuffledArray = shuffleGame(array);
        if (String.valueOf(playerGuess).equalsIgnoreCase("1")){
            if (shuffledArray[0]==0) {
                System.out.println("good guess!\n\t 1  2  3\n\t"+ Arrays.toString(shuffledArray));
            }else System.out.println("sorry!!! wrong guess!\n\t 1  2  3\n\t"+Arrays.toString(shuffledArray));
        }
        else if (String.valueOf(playerGuess).equalsIgnoreCase("2")) {
            if (shuffledArray[1]==0){
                System.out.println("good guess!\n\t 1  2  3\n\t"+Arrays.toString(shuffledArray));
            }else System.out.println("sorry!!! wrong guess!\n\t 1  2  3\n\t"+Arrays.toString(shuffledArray));
        }
        else if (String.valueOf(playerGuess).equalsIgnoreCase("3")) {
            if (shuffledArray[2]==0){
                System.out.println("good guess!\n\t 1  2  3\n\t"+Arrays.toString(shuffledArray));
            }else System.out.println("sorry!!! wrong guess!\n\t 1  2  3\n\t"+Arrays.toString(shuffledArray));
        }
        else {
            System.out.println("invalid input");
            tryAgain();
        }

        //implement here
    }

    /**
     * uses the previous functions in a good sequential way to run the game
     * uses the method recursion in order to loop in the game
     */
    public void play() {
        System.out.print(">");
        String response = sc.nextLine();
        if (response.equals("y")){
            System.out.println("pick 1, 2 or 3!\n\t [*, *, *]");
            checkGuess(array, playerGuess());
        } else if (response.equals("n")) {
            System.out.println("see you next time!");
        }else {
            System.out.println("are you ready to play? y/n");
            play();
        }
        tryAgain();
        //implement here
    }

    public void tryAgain(){
        System.out.println("do you want to try again? y/n");
        System.out.print(">");
        String response = sc.nextLine();
        if (response.equals("y")){
            System.out.println("pick 1, 2 or 3!\n\t [*, *, *]");
            checkGuess(array, playerGuess());
            tryAgain();
        } else if (response.equals("n")) {
            System.out.println("see you next time!");
        }else {
            tryAgain();
        }
    }
}
