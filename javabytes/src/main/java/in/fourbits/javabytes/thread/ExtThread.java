/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

/**
 *
 * @author Suraj
 */
public class ExtThread extends Thread {
    
    int i=0;    // Since you made this variable as class variable 2 thread are accessing same value and 
                // at max only 9 values are printed by both threads instead of 9 and 9
    
    public ExtThread()
    {
        
    }
    
    public ExtThread(String inThreadName)
    {
        super(inThreadName);
    }
    
    
    @Override
    public void run()
    {
        try {
             Thread t = Thread.currentThread();
          String name = t.getName();
            for(i=0;i<10;i++)   // now if i make i as local each thread has its own copy and total 9+9 18 values are printed by both threads
            {
                System.out.println(" Thread name ===> "+name+" ival ===> "+i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
        }
        
        
    }       
    
}
