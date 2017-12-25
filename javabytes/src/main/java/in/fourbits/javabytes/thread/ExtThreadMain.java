/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

import java.util.logging.Logger;

/**
 * Simple usage of Class extending Thread
 * @author Suraj
 */
public class ExtThreadMain {
    
    private static Logger logger = Logger.getLogger("in.fourbits.javabytes.thread.ExtThreadMain");
    
    public static void main(String[] args) {
        try {
            logger.info("############ Starting thread");
            ExtThread Th1=new ExtThread("Th1");
        ExtThread Th2=new ExtThread("Th2");
        Th1.start();
            System.out.println(" 11111111111");
        Th1.join(); // waits ubtill Th1 thread has finished its execution
        System.out.println(" 22222");
        Thread.sleep(1000);
        System.out.println(" 33333");
        Th2.start();
        System.out.println(" 44444");
        while(Th1.isAlive() || Th2.isAlive())       // waits untill either Th1 or Th2 threads are alive
        {
            Thread.sleep(300);
        }
            System.out.println(" end of thread");   // Note that this statement is executed when all the threads have finished its ececution
        } catch (Exception e) {
        }
        
    }
    
}
