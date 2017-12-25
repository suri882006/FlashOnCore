/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.overloading;

/**
 *
 * @author Suraj
 */
public class OverloadMeth {

    public static void book(short a) {
        System.out.print("short ");
    }
    
    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    
    public static void book(Long a) {
        System.out.print("LONG ");
    }
    
    public static void main(String[] args) {
        short shortRoom = 1;
        int intRoom = 2;
        
        book(shortRoom);
//        book(intRoom);    // Overloaded method does not exist
    }
    
}
