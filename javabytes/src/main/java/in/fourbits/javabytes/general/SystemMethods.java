/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *
 * @author Suraj
 */
public class SystemMethods {
    
    /**
     * This method is used to display all the methods related to System
     * @param args
     * System.getProperties lists all the installed java properties and path 
     * System.getenv gets all the registered environment variables in mycomputer properties
     * System.gc calls the GC and makes best attempt to reclaim memory of unused objects
     * System.currentTimeMillis displays the current time in milli seconds can be used for tracking the method performance
     */
    public static void main(String[] args) {
        System.out.println(" System Properties ===> "+System.getProperties());
        System.out.println(" get system enviornment variable classpath ===> "+System.getenv("classpath"));
        System.out.println(" get system enviornment variable java_home ===> "+System.getenv("java_home"));        
        System.out.println(" calling system.gc ===> ");       
        System.gc();
        System.out.println("get time in milliseconds ===> "+System.currentTimeMillis());                
    }    
}
