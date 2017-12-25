/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.tricks;

/**
 *
 * @author Suraj
 */
public class Test { 
    private static void doStuff(String str) {
        int var = 4;
        if (var == str.length()) {
            System.out.print(str.charAt(--var) + " ");
        }
        else {
            System.out.print(str.charAt(0) + " ");
        }
        Object myObj = new String[]{"one", "two", "three"};{
          for (String s : (String[])myObj) System.out.print(s + ".");
      }
        Short asd;
        short a;
    }
    public static void main(String args[]) {
        doStuff("abcd");
        doStuff("efg");
        doStuff("hi");
    }
}
