/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 *
 * @author Suraj
 */
public class NewClass {

    static {
        System.out.println(" instatic 1");
    }
    
    public NewClass()            
    {
        System.out.println(" in constructor");
    }
    
    {   // This block is executed only if Object of this class is created
        System.out.println("asd 2222");
    }
    
    
    
    static {
        System.out.println(" instatic 2");
    }
    static public void main(String[] args) {
        
        NewClass Obj=new NewClass();
        {
            System.out.println("asd");
        }
        
    }
    
}
