/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class LeakMemory {
    
    HashMap<Integer,EmpInfo> dataMap = new HashMap<Integer, EmpInfo>();
    
    public static void main(String[] args) {
        LeakMemory lm = new LeakMemory();
        for(int i=0;i<10000;i++) {
            
            EmpInfo emp = lm.new EmpInfo("one", "two");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LeakMemory.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
}
    
    class EmpInfo {

        public EmpInfo(String fname, String designation) {
            this.fname = fname;
            this.designation = designation;
        }
        String fname;
        String designation;
    }
    
}
