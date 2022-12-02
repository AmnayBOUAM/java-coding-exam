package problems.math;

import java.util.Scanner;

public class Fibonacci {

    /*
     *
     * write 30 Fibonacci numbers with java
     * 0,1,1,2,3,5,8,13
     *
    */

    public static void main(String[] args) {
            System.out.println("enter the size of the fibonacci series");
            System.out.print(">");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int first = 0;
            int second = 1;
            int fibonacci=0;
            System.out.print(first+", "+second);
            for(int j = 2; j <size; j++){
                fibonacci = first+second;
                System.out.print(", "+fibonacci);
                first=second;
                second=fibonacci;
        }
        //run your code here
    }
}
