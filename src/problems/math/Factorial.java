package problems.math;

import java.util.Scanner;

public class Factorial {

    /*
     *
     * factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * write a java program to find Factorial of a given number
     * you can use Recursion or Iteration
     *
     */

    public static int factoriel(int fact){

        if (fact< 0) {
            System.out.println(("there is no factorial for a negative number"));
            return (fact);
        }
        else if  (fact <= 1 && fact >=0)
            return (1);
        else
            return (fact * factoriel(fact - 1));

    }
    public static void main(String[] args) {
        System.out.println("enter the number to calculate the factorial");
        System.out.print(">");
        Scanner scanner = new Scanner(System.in);
        int fact = scanner.nextInt();
        System.out.println(fact+"! = "+factoriel(fact));
        //run your code here
    }

}
