/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.tricks;

/**
 *
 * @author Suraj
 */
public class SimpleTest {

    int a = 10;
    
    public void doStuff(int a) {
        a += 1;
        System.out.println(++a);
    }
    public static void main(String args[]) {
        SimpleTest t = new SimpleTest();
        t.doStuff(3);
    }

}
