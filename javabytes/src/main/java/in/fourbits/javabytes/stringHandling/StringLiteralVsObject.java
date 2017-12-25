/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.stringHandling;

/**
 * Using String literal and String constructor. Both are immutable
 * @author Suraj
 */
public class StringLiteralVsObject {
    
    // String Literal
    String location="mangalore";
    // String construcror - use this only when explicit copy of String is needed
    String locationObject = new String("mangalore");
    
    public static void main(String[] args) {
        StringLiteralVsObject  obj= new StringLiteralVsObject();
        obj.location.toUpperCase();
        System.out.println("literal upper case ==> "+obj.location);
        obj.locationObject.toUpperCase();
        System.out.println("locationObject upper case object ==> "+obj.locationObject);
        // After reassigning to locationObject
        obj.locationObject= obj.locationObject.toUpperCase();
        System.out.println("locationObject after reassigning upper case object ==> "+obj.locationObject);     
        System.out.println("location after reassigning upper case object ==> "+obj.location);     
        
        String strObj1= new String("home");
        String strObj2= new String("home");        
        //using == for 2 objects
        System.out.println("strObj1 == strObj2 --> "+ (strObj1 == strObj2));    // Returns false as both are different objects in heap
        
        String strLit1 ="literal2";
        String strLit2 ="literal2";
        
        //using == for 2 literals
        System.out.println("strLit1 == strLit2 --> "+ (strLit1 == strLit2));    // returns true as both literals are 
        // pointing to same location in string pool
    }
    
}
