/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.finalusage;

import java.util.HashMap;

/**
 * This is used to indicate that only immutable class name can act as final in method params,
 * the rest creates error only if memory object is changed
 * @author Suraj
 */
public class FinalUsage {
    
    
    public static void main(String[] args) {
        FinalUsage finalUsage = new FinalUsage();
        String name = "Suraj";
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "4");
        finalUsage.finalParam(name, map);
        
    }
    
    public void finalParam(final String name, final HashMap map) {
        //name="acharya"; // not allowed
        // map = new HashMap<String, String>();    // Not allowed
        map.put("3", "3");  // This is legal
        
        
    }
    
}
