/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *
 * @author Suraj
 */
public class JustMainMethod {

    /**
     * static block are executed even before the main or constructor
     */
    static {
        System.out.println("in empty block");
    }
    
    /**
     * default constructor
     */
    JustMainMethod() {
        System.out.println(" in default constructor");
    }
    
    public static void main(String[] args) {
        System.out.println(" in main");
        JustMainMethod justMainMethod = new JustMainMethod();
    }
    
    /**
     * Main method can be overridden but with different args
     * @param args 
     */
    public static void main(Integer[] args) {
        
    }
}
