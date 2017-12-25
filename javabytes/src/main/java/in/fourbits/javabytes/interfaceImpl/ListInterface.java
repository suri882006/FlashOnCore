/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Suraj
 */
public class ListInterface {
    
    public static void main(String[] args) {
        List Obj1=null;
        Obj1=new ArrayList();
        
        
        Obj1.add(1);
        Obj1.add(2);
        Obj1.add(3);
        
        for(Object Obj:Obj1)
        {
            System.out.println(" ArrayList val ==> "+Obj);
        }
        
        Obj1=new LinkedList();
        
        
        Obj1.add(4);
        Obj1.add(5);
        Obj1.add(6);
        
        for(Object Obj:Obj1)
        {
            System.out.println(" ArrayList val ==> "+Obj);
        }
        
    }
    
}
