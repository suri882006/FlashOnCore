/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class HashDemo {
    
    public static void main(String[] args) {
        String demo = "s";
        Long a;
        Double b;
        HashMap hs = null;
        
        System.out.println("hash ==> "+demo.hashCode());
        HashDemo hashDemo = new HashDemo();
        
        StringDemo  str1 = hashDemo.new StringDemo();
        System.out.println("intval --> "+str1.intValue());
    }
    
    class StringDemo extends Number {
        
        

        @Override
        public int intValue() {
            return 0;
        }

        @Override
        public long longValue() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public float floatValue() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public double doubleValue() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
}
