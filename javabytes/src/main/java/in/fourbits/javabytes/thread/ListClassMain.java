/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

import java.io.IOException;

/**
 *
 * @author Suraj
 */
public class ListClassMain {
    
    public static void main(String[] args) throws  IOException, InterruptedException{
        ListClass listClass = new ListClass();
        Thread t1 = new Thread(listClass);
        t1.start();
        
        //creating a new listClass Object does not cause any problem 
//        ListClass listClass1 = new ListClass();
//        Thread t2 = new Thread(listClass1);
//        t2.start();
        //Thread.sleep(2000);
        
        System.out.println("-- before listClass size --> "+listClass.myList.size());                
        
        //but doing things below causes concurrentModificaitonException as ArrayList is not threadsafe
        // unless you make method as synchronized
//        Thread t2 = new Thread(listClass);
//        t2.start();
        Thread.sleep(2000);
        int index=0;
        for(Integer i : listClass.myList) {
            listClass.myList.add(index++, 22);
            System.out.println("i --> "+ i);
        }
//        System.out.println("------------------");
//        for(Integer i : listClass1.myList) {
//            System.out.println("i --> "+ i);
//        }
    }
    
}
