/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

/**
 *
 * @author Suraj
 */
public class ThreadSleep  {
    
    private static void book() {
        System.out.print("book");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1);
        book();
    }
}
