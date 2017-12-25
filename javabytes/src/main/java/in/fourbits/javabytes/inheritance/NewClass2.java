/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 * Using Inner class inside the Method
 * @author Suraj
 */
public class NewClass2 {
    
    public void Display()
    {
        final int i=10; // If this variable is to be accessed inside the Inner class then declare it as final                       
        class Inner // By default access specifier is DEFAULT you cannot make it as private,public,protected
        {
            public void displayI()
            {
                System.out.println(" value of i iside Inner class is "+i);
            }
        }               
        Inner Obj=new Inner();
        Obj.displayI();        
    }
    public static void main(String[] args) {        
        
        NewClass2 Outer=new NewClass2();
        Outer.Display();
    }    
}
