/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 * When an Object is null it is not an instance of Object
 * @author Suraj
 */
public class NullInstanceOf {
    
    
public static void main(String []args) {
String str = null;
if(str instanceof Object) // NULLCHK
System.out.println("str is Object");
else
System.out.println("str is not Object");
}

    
}
