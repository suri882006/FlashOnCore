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

/**
 *
 * @author Suraj
 */


public class Hashmmap {
    
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
        
//        @Override
//        public boolean equals(Object obj) {
//            System.out.println("in equals");
//            if (obj == null) {
//                return false;
//            }
//            if (getClass() != obj.getClass()) {
//                return false;
//            }
//            final Customer other = (Customer) obj;
//            if (this.iCustId != other.iCustId) {
//                return false;
//            }                        
//            return true;
//        }

        @Override
        public int hashCode() {            
            int hash = 5;
            hash = 41 * hash + this.iCustId;                        
            System.out.println("in hashcode hashVal ===> "+hash);
            return hash;
        }
    }
    
//   static List<Integer> List1=new ArrayList<Integer>();
//   static List<Integer> List2=new ArrayList<Integer>();
   static HashSet<Customer> CustSet=new HashSet<Customer>();
   static HashMap<Customer,Integer> CustMap=new HashMap<Customer,Integer>();
   static HashMap<Customer,Integer> HsStringMap=new HashMap<Customer,Integer>();
   static Hashtable<Integer,Integer> HsTable=new Hashtable<Integer,Integer>();
    
    public static void main(String[] args) {
//    List1.add(1);
//    List1.add(2);
//    List1.add(3);
//    List1.add(4);
//    List1.add(5);
//    List1.add(-1);
//    
//    List2.add(2);
//    List2.add(1);
//    List2.add(7);
//    List2.add(3);
//        System.out.println("intttttt ===> "+CollectionUtils.containsAny(List1, List2));
//        for(Integer Obj:List1)
//        {
//            System.out.println(" Val ===> "+Obj);
//        }
// *******************************************************************************        
//        CustSet.add(new Customer(10));
//        System.out.println("11111111111111111111111111");
//        CustSet.add(new Customer(20));
//        System.out.println("22222222222222222222222222");
//        CustSet.add(new Customer(20));
//        System.out.println("33333333333333333333333333");
//        System.out.println(" set size ===> "+CustSet.size());
// *******************************************************************************
        // If a common Key is used then same key is replaced for further entries like below
        Customer custCommon = new Customer(10);
        CustMap.put(custCommon, 1);
        CustMap.put(custCommon, 2);
        CustMap.put(custCommon, 3);
        // Below entries created map size of 5 as each new Customer(10) is treated as different object
//        CustMap.put(new Customer(10), 1);
//        CustMap.put(new Customer(10), 2);
//        CustMap.put(new Customer(10), 3);
        CustMap.put(null, 4);
        CustMap.put(null, 5);   // HashMap allows only 1 null key        
        System.out.println(" map size ===> "+CustMap.size());
        System.out.println("getttt ===> "+CustMap.get(new Customer()));
        System.out.println(" get of null ===> "+CustMap.get(null));    
        System.out.println(" add existing value ===> "+CustMap.put(new Customer(10), 3));   // When you add a key which already exists
        // Then it returns the old value for the key, null otherwise
        CustSet.add(null);
        
        // Hashtable does not allow Key or Value to be null where as HashMap allows
        //HsTable.put(null, 123);   
//        HsTable.put(null, null);
//        **************************************************************************
//        HsStringMap.put(new Customer(), 1);
//        HsStringMap.put(new Customer(), 2);
//        HsStringMap.put(new Customer(), 3);
//        System.out.println(" HsStringMap size ===> "+HsStringMap.size());
        
        // Iterating a HashMap
        for(Map.Entry e:CustMap.entrySet()) {
            System.out.println("key --> "+e.getKey()+" value --> "+e.getValue());
        }
        
    }
}
