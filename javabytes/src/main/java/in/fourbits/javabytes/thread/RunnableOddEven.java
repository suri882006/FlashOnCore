/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

/**
 *
 * @author Suraj
 */
public class RunnableOddEven implements Runnable{
    
    int i=0;
    
    public RunnableOddEven()
    {
        
    }
    
//    public RunnableOddEven(String inName)
//    {
//        super(inName);
//    }

    @Override
    public void run() {
        try {
            Thread Th=Thread.currentThread();
        System.out.println(" Thread name ===> "+Th.getName());
        synchronized (this){
        for(i=0;i<20;i++)
        {
            if(Th.getName().equals("T1"))   // Print Evens
            {
                if((i%2)==0)
                    System.out.println("T1 "+i);
            }
            else    // Print odds
            {
                if((i%2)!=0)
                    System.out.println("T2 "+i);
            }            
            Thread.sleep(500);
        }
        }
        } catch (Exception e) {
        }
        
        
    }
    
}
