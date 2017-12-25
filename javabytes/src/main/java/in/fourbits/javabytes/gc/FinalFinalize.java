/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.gc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suraj
 */
public class FinalFinalize {
    
    private static final int miVal=12;
    private String mName="Suraj";
    
    /**
     * This function shows usage of final variables
     * @param args
     * variable declared as final cannot be altered
     */
    public static void main(String[] args) {
        //miVal=30;   // This is wrong
        System.out.println(" in main");
        System.gc();
    }
    
    @Override
    public void finalize()
    {
        try {
            super.finalize();
        System.out.println(" in finalize");
        } catch (Exception e) {
        } catch (Throwable ex) {
            Logger.getLogger(FinalFinalize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
