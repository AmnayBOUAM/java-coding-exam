package problems.math;

import java.util.ArrayList;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {

        ArrayList primeList = new ArrayList();
        for (int i = 2 ; i< 100000; i++){
            boolean prime = true;
            for (int j = 2 ; j<i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) primeList.add(i);
        }
        System.out.println("Prime number: "+primeList);

        //write your code here
    }
}
