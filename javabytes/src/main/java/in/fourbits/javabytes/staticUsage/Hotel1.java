/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.staticUsage;

/**
 *
 * @author Suraj
 */


public class Hotel1 extends Hotel  {
    public void book() {
        System.out.print("booked");
    }
    
    public static void main(String args[]) {
        try {
                Hotel h = new Hotel1();
                Hotel h1=new Hotel();
                
        h.book();
        h1.book();
        } catch (Exception e) {e.printStackTrace();
        }
        
    }   
}
