/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

import in.fourbits.javabytes.inheritance.ClassA;

/**
 *
 * @author Suraj
 */
public class DiffWaysInstClass {
    
    public static void main(String[] args) {      
        try {            
            ClassA InstObj=(ClassA)Class.forName("in.fourbits.javabytes.ClassA").newInstance();    
            if(InstObj!=null)
                System.out.println("ClassA inst not null");
            else
                System.out.println("ClassA inst not null");            
            // This is also possible in case if it is not being referenced by static context
            //Class emp = Class.forName("in.fourbits.javabytes.ClassA", true, this.getClass().getClassLoader());
        } catch (Exception e) {e.printStackTrace();
        }
        
        try {
            ClassA LoaderObj=(ClassA)ClassA.class.getClassLoader().loadClass("in.fourbits.javabytes.ClassA").newInstance();
            if(LoaderObj!=null)
                System.out.println("ClassA LoaderObj inst not null");
            else
                System.out.println("ClassA LoaderObj inst not null");            
        } catch (Exception e) {e.printStackTrace();
        }
        
        try{
            System.out.println("trying");
        }
    finally
    {
            System.out.println("finally");
    }
        
    }
    
    
    
}
