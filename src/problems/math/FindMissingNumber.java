package problems.math;

import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {

    /*
     *
     * the below array is supposed to have a range of number from 1 to 10
     * {10, 2, 1, 4, 5, 3, 7, 8, 6}
     * one number is missing (9 in this case)
     * write java code to find the missing number from the array
     * use a static helper method to find it
     *
     */

    public static void main(String[] args) {

        Integer[] array = new Integer[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        for (int i = 0; i<array.length-1; i++) {
            for (int j = i+1; j<array.length; j++)
            if (array [i] > array[j] ){
                int permutation= array[j];
                array[j] =array[i];
                array[i]=permutation;
            }
        }
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);
        for (int i = 0; i<list.size(); i++){
            if((list.get(i+1)-list.get(i))>=2);
            System.out.println(list.get(i)+1);
        }


        int[] arr = { 1, 2, 4, 5, 6 };
        int n=arr.length;
        int sum1=((n)*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<n;i++)
            sum2=sum2 + arr[i];


        System.out.println(sum1);
        System.out.println(sum2);
    }
}
