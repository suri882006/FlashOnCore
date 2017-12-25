/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suraj
 */
public class ListClass implements Runnable {
    
    public List<Integer> myList = new ArrayList<Integer>();
        

    @Override
    public void run() {
        //System.out.println("myList is null -- > "+(myList !=null));
        synchronized(myList) {
        for(int i=0;i<=10;i++) {
        //myList.add(new Integer(i));
            myList.add(i);
        }
        }
    }
    
}
