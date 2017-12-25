/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.threadevenodd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Suraj
 */
public class Numbers {

    public List<Integer> oddList = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
    public List<Integer> evenList = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));
    static boolean isEven = false;
    static int evenCounter = 0;
    static int oddCounter = 0;

    public void printNumbers() throws Exception {
        synchronized (Numbers.class) {
            if (isEven) {
                print(Thread.currentThread().getName(), evenCounter++, evenList);
            } else {
                print(Thread.currentThread().getName(), oddCounter++, oddList);
            }
        }
    }

    public void print(String threadName, int i, List<Integer> list) throws Exception {
        isEven = !isEven;
        Thread.currentThread();
        System.out.println(threadName + "- " + list.get(i) + ", ");
        Thread.currentThread();
        Thread.sleep(1000);
    }
}
