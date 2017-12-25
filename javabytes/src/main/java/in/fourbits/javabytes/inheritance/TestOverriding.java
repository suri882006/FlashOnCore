/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 * Static vs Dynamic binding
 * Binding of private, static and final methods always happen at compile time since these methods cannot be overridden. 
 * so this always calls the method of base class
 * @author Suraj
 */
public class TestOverriding {
    public static void main(String aga[]){
    Super superRef =new Sub();
    Sub subRef = new Sub();
    Super suRef=new Super();
    Sub2 subRef2 = new Sub2();
     
    superRef.tests();   // Always call Sub class test as SuperRef reference is of type Sub
    subRef.tests();
    suRef.tests();
    
        System.out.println("---------------");
    //((Sub2)superRef).tests();
        
    ((Sub2)superRef).tests();    
    
    ((Sub2)subRef2).tests();
        
    
    }
}
class Super{
    // If these methods were static always method of super class will be called
     public void tests(){
        System.out.println("Super static");
    }
}
class Sub extends Super{    
    public void tests(){
        System.out.println("Sub2 static");
    }
    
    public void subMethod() {
        
    }
}
    
class Sub2 extends Sub{    
    public void tests(){
        System.out.println("Sub222 static");
    } 
    
    public void subMtehod() {
        
    }
}

