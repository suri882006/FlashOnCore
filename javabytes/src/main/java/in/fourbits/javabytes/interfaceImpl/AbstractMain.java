/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

import in.fourbits.javabytes.interfaceImpl.SampleAbstractClass;

/**
 *
 * @author Suraj
 */
public class AbstractMain  {

    public static void main(String[] args) {
        
//        SampleAbstractClass Obj=new SampleAbstractClass();    // This is illegal abstract class cannot be instantiated
        clsExtAbstractClass Obj=new clsExtAbstractClass();        
        Obj.displayData();
        Obj.setMintVal(83);
        Obj.displayData();
        Obj.justMethod();   // definition in abstract class        
        Obj.abstMethod();
        clsExtAbstractClass Obj1=new clsExtAbstractClass();        
        Obj1.displayData();
    }
    
    public static class clsExtAbstractClass  extends SampleAbstractClass
    {
        public void displayData()
        {
            System.out.println(" value of integer is ===> "+getMintVal());
        }
        
//        public void justMethod()    // This is overridden method
//        {
//            System.out.println(" justMethod in extended class clsExtAbstractClass");
//        }       

        @Override
        public void abstMethod() {  // This has to be overridden as clsExtAbstractClass is inturn not abstract
            System.out.println(" in abstMethod which is overridden from SampleAbstractClass class which was just abstract method and did"
                    + "not have method body");
        }

        @Override
        public void displayMethod() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setData() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
    
}
