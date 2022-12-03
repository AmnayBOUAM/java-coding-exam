package shufflegame;

public class RunGame {

    public static void main(String[] args) {

        //run this main method to play
        System.out.println("----------------------------------welcome to shuffle game-------------------------------");
        System.out.println("guess where the 0 is ?");
        System.out.println("are you ready to play? y/n");

        ShuffleGame shuffleGame = new ShuffleGame();

        shuffleGame.play();

    }
}
