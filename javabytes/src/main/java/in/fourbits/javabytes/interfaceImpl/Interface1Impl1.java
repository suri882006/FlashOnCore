/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

import static in.fourbits.javabytes.interfaceImpl.Interface1.Inf1Val;

/**
 * second interface implementing Interface1
 * @author Suraj
 */
public class Interface1Impl1 implements Interface1 {

    @Override
    public void defaultMethod() {
        System.out.println(" in public method of Interface1Impl one with Inf1Val =="+Inf1Val);
    }

    @Override
    public void publicMethod() {
        System.out.println(" in public method of Interface1Impl one with Inf1Val =="+Inf1Val);
    }
    
}
