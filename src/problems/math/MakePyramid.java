package problems.math;

public class MakePyramid {

    /*

    Implement a large Pyramid of stars in the screen with java.

          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *

     */

    public static void main(String[] args) {
        //write your code here
        int sizePyramid =9;
        for (int i = 0; i < sizePyramid; i++){
            for (int j = 0; j < sizePyramid - i; j++){

                System.out.print(" ");
            }

            for (int k=0; k <= i; k++){
                System.out.print(" *");
            }
                System.out.println("");
        }
    }
}
