package problems.math;

public class FindLowestDifference {
    /*
     *
     * consider these below two arrays (array1 and array2)
     * find the lowest difference between the two arrays cells
     * hint: the lowest difference between cells is 1
     *
	 */
    void  difference(int array[], int arrayLength){
        arrayLength = array.length;
        int diff = Math.abs(array[arrayLength-arrayLength]-array[arrayLength-arrayLength+1]);
        for (int i = 0; i< arrayLength-1; i++){
            for (int j = i + 1; j< arrayLength; j++){
                if (Math.abs(array[i]-array[j])<diff)
                    diff = Math.abs(array[i]-array[j]);
            }
        }
        System.out.println(diff);

    }

    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        FindLowestDifference d = new FindLowestDifference();
        //d.difference(array1, array1.length);
        d.difference(array2, array2.length);
    }
}
