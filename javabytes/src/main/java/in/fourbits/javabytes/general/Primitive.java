/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *
 * @author Suraj
 */
class A {

    static int add(int i, int j) {
        return i + j;
    }
}

public class Primitive extends A {

    public static void main(String argv[]) {
        short s = 9;
        System.out.println(add(s, 6));
    }
}
