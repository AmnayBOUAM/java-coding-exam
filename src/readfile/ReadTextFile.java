package readfile;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class ReadTextFile {
    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */

    public static void main(String[] args) {

        //write your code here
        FileReader reader;
        LinkedList<String> list = new LinkedList<String>();

        try {

            reader = new FileReader("/Users/mac/IdeaProjects/java-coding-exam/src/readfile/file-data");

            BufferedReader buffer
                    = new BufferedReader(reader);

            String line = "";

            long initialTime = System.currentTimeMillis();
            while (true) {

                try {

                    line = buffer.readLine();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
                if (line == null)
                    break;
                System.out.println(line);
                list.add(line);

            }
            System.out.println();
            System.out.println("Time taken : "
                    + (System.currentTimeMillis()
                    - initialTime));
            try {
                buffer.close();
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        System.out.println(list);
        System.out.println(list.get(1));

    }

}
