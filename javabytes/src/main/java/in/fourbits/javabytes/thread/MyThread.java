/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

/**
 *
 * @author Suraj
 */
class MyThread extends Thread 
{
    public static void main(String [] args) 
    {
        String a = "newspaper";
a = a.substring(5,7);
        System.out.println(" aftwr sub ====> "+a);
char b1 = a.charAt(1);
a = a + b1;
System.out.println(a);
        
        MyThread t = new MyThread();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");        
        
        
        int i = 0, j = 5; 
//tp: for (;;) 
//    {
//        i++;  
//        for (;;) 
//        {
//            if(i > --j) 
//            {
//                break tp; 
//            } 
//        }         
//        System.out.println("i =" + i + ", j = " + j);
//        break tp;
//        
//    }
        
        int I = 0;
        boolean b;
//label:
//    if (I < 2) {
//    System.out.print("I is " + I);
//    I++;
//    continue label;
//}
//        while(b=true)
//        {
//            
//        }
        
//        try 
//        { 
//            int x = 0; 
//            int y = 5 / x; 
//        } 
//        catch (Exception e) 
//        {
//            System.out.println("Exception"); 
//        } 
//        catch (ArithmeticException ae) 
//        {
//            System.out.println(" Arithmetic Exception"); 
//        } 
//        System.out.println("finished");
        
        
        
    }
    public void run() 
    {
        System.out.print("Thread ");
    }
}
