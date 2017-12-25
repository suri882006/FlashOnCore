/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Vector;

/**
 * This class demonstrates that class declared as final cannot be extended
 * @author Suraj
 */
public class CompanySub { //  extends CompanyBase This is an error
    
    public static void main(String[] args) {
        System.out.println(" in main");
        String asd=" ";
        System.out.println(" hashcode ===> "+asd.hashCode());
        Hashtable hsTable=new Hashtable();
        hsTable.put("suraj", "acharya");
        HashMap hs=new HashMap();
//        for(Map.Entry Obj:hsTable.entrySet())
//        {            
//        }
        System.out.println(" value "+hsTable.keys());
        hs.keySet().iterator();        
        
    }
    
}
