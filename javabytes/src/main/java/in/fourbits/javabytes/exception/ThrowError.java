/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.exception;

/**
 *
 * @author Suraj
 */

public class ThrowError
{  
    public static void main(String [] args) 
    {
        
        try 
        {
            System.out.println(" val ===> "+(16*4));
            Double d = Math.random();
            System.out.println(" math random ===> "+(d));
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {
            System.out.print("B");  
        } 
        finally 
        {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() 
    {
        throw new Error(); /* Line 22 */
    } 
}
