/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Suraj
 */
public class Vectorinfo {
    
    
    public static < F > void printArray( F[] inputArray )
    {
      // Display array elements              
         for ( F element : inputArray ){        
            System.out.printf( "%s ", element );
         }
         System.out.println();
    }
    
    public static void main(String[] args) {
        Vector VectorObj=new Vector();
        List asd=new LinkedList();
        List<Integer> IntList=new ArrayList<Integer>();
        IntList.add(1);
        Iterator Itr=IntList.iterator();
        while(Itr.hasNext())
        {
            Integer Obj=(Integer)Itr.next();
            System.out.println(" Obj===> "+Obj);   
            Itr.remove();// Exists
        }
        
        VectorObj.add("Vec1");        
        Enumeration Enm=VectorObj.elements();
        while(Enm.hasMoreElements())
        {
            System.out.println(" vectior ===> "+Enm.nextElement());
//            Enm.remove(); // Remove method does not exists
        }
        
    }
    
}
