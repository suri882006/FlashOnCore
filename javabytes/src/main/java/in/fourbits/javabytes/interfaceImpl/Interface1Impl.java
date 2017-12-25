/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

import in.fourbits.javabytes.accessSpecifiers.InheritAccessSpecMethods;
import static in.fourbits.javabytes.interfaceImpl.Interface1.Inf1Val;

/**
 * Using Interfaces variables and abstract methods from interface named Interface1
 * @author Suraj
 */
public class Interface1Impl extends InheritAccessSpecMethods implements Interface1 {
    
    @Override
    public void publicMethod()
    {
//        Inf1Val=24;   // This is illegal as interfaces member variables are by default static final
        super.publicMethod(); // all the base class publicmethod is called first 
        System.out.println(" in public method of Interface1Impl with Inf1Val =="+Inf1Val);
    }
    
    @Override
    public void defaultMethod()
    {
        System.out.println(" in default method of Interface1Impl with Inf1Val =="+Inf1Val);
    }    
}
