/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.threadevenodd;

/**
 *
 * @author Suraj
 */
public class NumbersRun implements Runnable {

    @Override
    public void run() {
        Numbers numbers = new Numbers();
        if (Thread.currentThread().getName().equals("evenRunner")) {
            try {
                // Sleep the EvenRunner to initially start with odd number 1
                Thread.currentThread();
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        try {
            for (int i = 0; i < 5; i++) {
                numbers.printNumbers();
                // Use this ssleep to print corresponding even/odd Runner for even/odd list
                Thread.currentThread();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
