package datastructure.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        //write your code here

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++ ){
            list.add(i+5);
        }
        System.out.println("The ArrayList values: "+list);

        list.remove(Integer.valueOf(6));
        list.remove(5);
        System.out.println(list);

        Iterator<Integer> iter = list.iterator();
        System.out.print("The iterator values: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
