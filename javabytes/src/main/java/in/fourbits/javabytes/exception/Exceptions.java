/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Suraj
 */
public class Exceptions {

    /** This method is just illustrating exceptions
     * @param args the command line arguments
     *  One try can have multiple catch but only 1 try block should exist
     *  finally block is not mandatory
     *  catch block is mandatory
     *  Order of catch exception should be from sub classes to base class i.e Exception
     *  System.Exit exists the currently running JVM with a status code assuming that a non zero status code is abnormal termination
     *  Finally block is never executed if system.exit(status) is used
     * Unchecked exceptions come in two types: (refer resources/Throwble)
            Errors
            Runtime exceptions
     *  catch block is not mandatory if final block exists 
            
     */
    public static void main(String[] args) {        
        try
        {
            int a=10;
            int b=50;
            System.out.println("c =====> "+a/b);
//            System.exit(1);   // Equivalent to line commented below
//            Runtime.getRuntime().exit(1);
            System.out.println(" in try after system.exit");
            System.out.println("System.console()===> "+System.console());
            System.out.println("System.console()===> "+System.getProperties());
            File f = new File("asd");
            FileInputStream fileInputStream = new FileInputStream(f);
        }
        // Runtime exception (Unchecked)
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic exception being caught");
            ae.printStackTrace();
        }
        //Runtime exception (Unchecked)
        catch (IOException e) {
        }       
        catch(Exception e)
        {
            System.out.println("Base class exception ");
            e.printStackTrace();
        }            
               
        finally
        {
            System.out.println("executing finally");
        }
        
        /**
         * catch block is not mandatory if final block exists
         */
        try{
            
        }
        finally {
            
        }
        
    }
}
