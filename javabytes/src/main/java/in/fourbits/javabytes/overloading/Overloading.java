/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.overloading;

/**
 * Methods to declare overloading
 * @author Suraj
 */
public class Overloading {
    
    public static int add(int a,int b)
    {
        return (a+b);
    }
    
    public static int add(int a,int b,int c)
    {
        return (a+b);
    }
    
    public static void main(String[] args) {
        add(1,2);
    }
    
}
