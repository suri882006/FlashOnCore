/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.exception;

import java.io.IOException;

/**
 *
 * @author Suraj
 */
public class ExceptionCheck {
    


public static void aMethod() throws Exception 
    {
        try /* Line 5 */
        {
            throw new Exception(); /* Line 7 */
        } 
        finally /* Line 9 */
        {
            System.out.print("finally "); /* Line 11 */
        }                 
        
    } 
    public static void main(String args[]) 
    {
        try 
        {
            aMethod();  
        } 
        catch (Exception e) /* Line 20 */
        {
            System.out.print("exception "); 
        } 
        System.out.print("finished"); /* Line 24 */
        
        try 
        {
            System.out.print("Hello world ");
        }
        finally 
        {
            System.out.println("Finally executing ");
        }
        
    } 
    
}
