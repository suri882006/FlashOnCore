/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 *
 * @author Suraj
 */
class Overloaded {
public static void foo(Integer i) { System.out.println("foo(Integer)"); }
public static void foo(short i) { System.out.println("foo(short)"); }
public static void foo(long i) { System.out.println("foo(long)"); }
public static void foo(int ... i) { System.out.println("foo(int ...)"); }
public static void main(String []args) {
foo(10);    // calls long
foo(new Integer(2));    // calls Integer
foo(1);    // calls Integer
foo(1,2,3); // calls int...
}
}
