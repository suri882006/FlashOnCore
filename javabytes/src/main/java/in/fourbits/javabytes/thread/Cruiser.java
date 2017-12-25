/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

/**
 *
 * @author Suraj
 */
public class Cruiser implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new Cruiser());
        a.start();
        
        System.out.print("Begin");
        a.join();
        System.out.print("End");
    }
    
    public void run() {
        System.out.print("Run");
    }
}

