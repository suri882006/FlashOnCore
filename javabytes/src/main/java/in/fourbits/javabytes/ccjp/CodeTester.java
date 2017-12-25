/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 *
 * @author Suraj
 */
public class CodeTester {
    
    static int pivot = test();
    
    public int a=1;
    public int b=2;
    
    
    static public int test() {
        System.out.println("pivot --> "+pivot);
        return 99;
    }
    
    public static void main(String[] args) {
        System.out.println("main pivot --> "+pivot);
    }
    
    public void method(final int c) {
        final int d = 3;
        class inner {
            private void imethod( int e) {
                a=5;    // a is accessible
                b=25;
                System.out.println("d --> "+d);
                System.out.println("c --> "+c);
            }
        }
    }
    
    
}
