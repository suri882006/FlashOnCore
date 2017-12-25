/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.staticUsage;

/**
 * First static block executes then the normal code block executes, then enters the main method
 * normal code block is not executed if Instance of class is not created
 *
 * @author Suraj
 */
public class Sample {
    
    static Integer Obj=new Integer(10);
    
    {
        System.out.println(" in just block");
    }
    static{
        System.out.println(" in static 1");
    }
    
    public static void main(String[] args) {
        Obj=12;     
        Sample sample = new Sample();
        System.out.println("in main");
        
    }
    
}
