/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.staticUsage;

/**
 *
 * @author Suraj
 */
public class StaticUsage1 {
    
    int nonStatic=0;
    static int staticVar=0;
    
    public static void main(String[] args) {
        //This is illegal static methods cannot access non static members
        //i=45;
        // This is legal
        staticVar=45;
        // This is illegal local variables cannot have access specifiers
        //private int privateVar=0;
        
        StaticUsage1 usage1 = new StaticUsage1();
        // this is legal as instance var can only access non static var
        System.out.println("nonstatic var -- > "+usage1.nonStatic);
        // Instance var can also access staticVar as good as using it with className 
        System.out.println("nonstatic var -- > "+usage1.staticVar);                
        
        // Accessingf static method using instance variable not good
        usage1.staticMethod();
        
        // Illegal Non static method cannot be referenced by static context
        //nonStaticMethod();
        
        
    }
    
    public static void staticMethod() {
        // this is illegal
        //i=45;
    }
    
    public void nonStaticMethod() {
     staticVar=20;   
    }
    
}
