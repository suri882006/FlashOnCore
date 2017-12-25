/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.util.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Suraj
 */


public class HashSetContains {
    
    public static class Customer
    {
        int iCustId=0;
        Customer(int iniVal)
        {
            this.iCustId=iniVal;
        }
        
        Customer()
        {
            
        }
        
        @Override
        public boolean equals(Object obj) {  
            System.out.println("in equalssssssssssssss");
            return true;
        }

        @Override
        public int hashCode() {   
            int a = new Random().nextInt(1000);
            System.out.println(" rand ---> "+a);
            return a;
        }
    }
    
//   static List<Integer> List1=new ArrayList<Integer>();
//   static List<Integer> List2=new ArrayList<Integer>();
   static HashSet<Customer> CustSet=new HashSet<Customer>();
   static HashMap<Customer,Integer> CustMap=new HashMap<Customer,Integer>();
   static HashMap<Customer,Integer> HsStringMap=new HashMap<Customer,Integer>();
   static Hashtable<Integer,Integer> HsTable=new Hashtable<Integer,Integer>();
    
    public static void main(String[] args) {
        CustSet.add(new Customer(10));
        CustSet.add(new Customer(10));
        CustSet.add(new Customer(10));
        //CustMap.put(null, 4);
        CustMap.put(null, 5);   // HashMap allows only 1 null key
        System.out.println("Containsssss --- > "+CustSet.contains(new Customer(10)));
        System.out.println(" cust size ===> "+CustSet.size());
        System.out.println("getttt ===> "+CustMap.get(new Customer()));
        System.out.println(" get of null ===> "+CustMap.get(null));    
        System.out.println(" add existing value ===> "+CustMap.put(new Customer(10), 3));   // When you add a key which already exists
        // Then it returns the old value for the key, null otherwise
        CustSet.add(null);
        
        
        
        // Iterating a HashMap
        for(Map.Entry e:CustMap.entrySet()) {
            System.out.println("key --> "+e.getKey()+" value --> "+e.getValue());
        }
        
    }
}
