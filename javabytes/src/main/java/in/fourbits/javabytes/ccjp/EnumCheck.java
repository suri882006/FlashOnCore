/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 *
 * @author Suraj
 */
public class EnumCheck {
    
    enum Month {
        JAN, FEB, MAR
    };
    
    public static void main(String[] args) {
        Month m1 = Month.JAN;
        Month m2 = Month.JAN;
        Month m3 = Month.FEB;
        
        System.out.println("m1 ==  m2 " +(m1 == m2));
        System.out.println("m1.equals(m2) "+m1.equals(m2));
        System.out.println("m1 == m3 "+(m1 == m3));
    }
    
}
