package datastructure.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */

    public static void main(String[] args) {

        //write your code here
        Integer[] array1 = {1, 3, 2, 4, 8, 9, 0};
        Integer[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};
        //Union
        HashSet<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(array1));
        set1.addAll(Arrays.asList(array2));
        System.out.println(set1);
        //Intersection
        HashSet<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(array1));
        set2.retainAll(Arrays.asList(array2));
        System.out.println(set2);
        //Symmetric difference
        HashSet<Integer> symmetricDifference = new HashSet<>();
        set1.removeAll(set2);
        symmetricDifference.addAll(set1);
        System.out.println(symmetricDifference);

    }

}
