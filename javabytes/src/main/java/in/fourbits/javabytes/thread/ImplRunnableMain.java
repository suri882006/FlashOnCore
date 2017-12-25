/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

/**
 *
 * @author Suraj
 */
public class ImplRunnableMain {
    
    public static void main(String[] args) {
        try {
        ImplRunnable Th1=new ImplRunnable();
        Thread TObj=new Thread(Th1,"TT1");
        Thread TObj1=new Thread(Th1,"TT2");
        TObj.start();
//        TObj.join(); // waits ubtill Th1 thread has finished its execution
//        Thread.sleep(1000);
        TObj1.start();
        while(TObj.isAlive() || TObj1.isAlive())       // waits untill either Th1 or Th2 threads are alive
        {
            Thread.sleep(300);
        }
            System.out.println(" end of thread");   // Note that this statement is executed when all the threads have finished its ececution
        } catch (Exception e) {
        }
    }
    
}
