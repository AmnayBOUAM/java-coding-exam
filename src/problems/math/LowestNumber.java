package problems.math;

public class LowestNumber {
    /*
     *
     * write java code to find the lowest number from the given array
     *
     */

    public static void main(String[] args) {

        int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        for (int i = 0; i<array.length-1; i++) {
            for (int j = i+1; j<array.length; j++)
                if (array [i] > array[j] ){
                    int permutation= array[j];
                    array[j] =array[i];
                    array[i]=permutation;
                }
        }
        System.out.println("the lowest number from the given array is : "+array[0]);
    }
}
