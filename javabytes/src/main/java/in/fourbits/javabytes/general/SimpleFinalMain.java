/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

import java.lang.String;

/**
 *
 * @author Suraj
 */
class  SimpleFinalMain {
    
    // Main class cannot be declared as protected,private,static
    
    static {
        System.out.println(" hey this line is executing before main method");
    }
    
    static final public void main(String[] args) {
        System.out.println("main method declared as final");
        System.out.println(" also the order static public final does not matter as long as void preceeds main");
    }
    
    public void display()
    {
//        static int a=0; // This is illeagal as static are class level variables
//        abstract int b=0;   // This is illegal only classes can be abstract
    }
    
    public class publicClass   // This is vlaid, innter class can be declared as protected
    {
//        static    // This is illegal
//        {
//            System.out.println("asd");
//        }
    }
    
}

//public class again()  // Only 1 class can have public
//{
//    
//}


