/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

/**
 *
 * @author Suraj
 */
public class RunnableOddEvenMain {
    public static void main(String[] args) {
        try {
            RunnableOddEven Obj1=new RunnableOddEven();
            RunnableOddEven Obj2=new RunnableOddEven();
            Thread t1=new Thread(Obj1,"T1");            
            Thread t2=new Thread(Obj2,"T2");
            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            System.out.println("Thread 11 started");
//            t1.sleep(500);
            t2.start();
            System.out.println("Thread 22 started");
            if(t1.isAlive() || t2.isAlive())
            {
                Thread.sleep(300);
            }
        } catch (Exception e) {e.printStackTrace();}
        
    }
    
}
