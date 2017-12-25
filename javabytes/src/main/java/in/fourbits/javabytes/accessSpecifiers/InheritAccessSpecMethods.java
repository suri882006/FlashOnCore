/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.accessSpecifiers;

/**
 * This class inherits or extends class AccessSpecifierMethods and note that all the access specifiers
 * default,public,protected are available but not private
 * as private methods are available to only the class in which it is defined
 * @author Suraj
 */
public class InheritAccessSpecMethods extends AccessSpecifierMethods {

    @Override
    void defaultmethod() {        
        super.defaultmethod(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" in default method of class InheritAccessSpecMethods");
    }

    @Override
    public void publicMethod() {
        super.publicMethod(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" in publilc method is class InheritAccessSpecMethods");
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod(); //To change body of generated methods, choose Tools | Templates.
    }

    // privateMethod from base class AccessSpecifierMethods is not accessible here.
    
    
    
}
