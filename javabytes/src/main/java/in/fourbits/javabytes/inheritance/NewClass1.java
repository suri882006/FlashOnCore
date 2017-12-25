/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 *
 * @author Suraj
 */
public class NewClass1 {
    
    public static void change(int[] a) {
        a[0]=3;
        a[1]=4;
        
    }
    
    public static void changeref(int[] a) {
        a = new int[2];
        a[0]=3333;
        a[1]=4444;
        
    }
    
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0]=2;
        a[1]=3;
        change(a);
        System.out.println("0- "+a[0]+"1 -> "+a[1]);
        changeref(a);
        System.out.println("0- "+a[0]+"1 -> "+a[1]);
    }
    
}
