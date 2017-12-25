/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 * Using Inner class within main class
 * @author Suraj
 */
public class NewClass3 {

    public class Inner  // All the access specifiers are made available here
    {
        public void InnerDisplay()
        {
            System.out.println(" In inner class display");
        }                
    }
    
    public static void main(String[] args) {
        NewClass3 Outer=new NewClass3();// First create an instance of Outer Object
        NewClass3.Inner InnerObj=Outer.new Inner(); // Now with the help of Outer Object create an object of inner class this way
        InnerObj.InnerDisplay();
    }
    
}
