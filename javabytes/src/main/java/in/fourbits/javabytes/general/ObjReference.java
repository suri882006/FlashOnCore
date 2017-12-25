/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *
 * @author Suraj
 */
public class ObjReference {
    public static void main(String[] args) {
        Integer arr[] = new Integer[5];
       for (int i = 0; i < arr.length; i++) {
           Integer myInt = new Integer(i);
           arr[i] = myInt;
           System.out.println(" before myInt ===> "+myInt);
           System.out.println(" before arr ===> "+arr[i]);
           myInt=25;
           System.out.println(" after myInt ===> "+myInt);
           System.out.println(" after arr ===> "+arr[i]);
       }
       System.out.println("end");
    }
}
