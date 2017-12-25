/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.threadevenodd;

/**
 *
 * @author Suraj
 */
public class NumbersMain {

    public static void main(String[] args) {
        try {
            Runnable evenRunner = new NumbersRun();
            Runnable oddRunner = new NumbersRun();

            Thread evenThread = new Thread(evenRunner, "evenRunner");
            Thread oddThread = new Thread(oddRunner, "oddRunner");
            evenThread.start();
            oddThread.start();
            evenThread.join();
            oddThread.join();
            // join method waits untill the Thread has finished its execution
            System.out.println("exiting main method");   
            // isAlive gives the status if Thread is still active/dead
            System.out.println("evenThread is alive "+evenThread.isAlive());
            System.out.println("oddThread is alive "+oddThread.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
