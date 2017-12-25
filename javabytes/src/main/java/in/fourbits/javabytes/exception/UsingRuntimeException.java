/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.exception;

/**
 *
 * @author Suraj
 */
public class UsingRuntimeException {
    
    /**
     * Finally is always executed in RuntimeException until and unless System.Exit(0) is called
     * @param args 
     */
    public static void main(String[] args) {
        UsingRuntimeException runtimeException = new UsingRuntimeException();
        long longVar = 0x1e240;
        long longVar1 = 22_22;
        int var; // possible as case sensitive
        int VAR;    // possible as case sensitive
        try {
            System.out.println("longVar1 --> "+longVar1);
        throwEx();
        } catch (Exception e ){
            System.out.println("exception e-> "+e.getClass());  
            Object o = new Object();            
        }
        finally {
            System.out.println("in finally exiting");
        }
    }
    
    public static void throwEx() {
        throw new RuntimeException();
    }
    
}
