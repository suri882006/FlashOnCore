/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.accessSpecifiers.package1;

/**
 * This class extends AccessSpecifierMethods from different package named in.fourbits.javabytes
 * and note that only protected and public methods are made available here, where as 
 * default and private are not available as default access specifier is package specific and 
 * private is available only to class in which it is defined
 * @author Suraj
 */
public class OtherPackageInheritAccessSpec extends in.fourbits.javabytes.accessSpecifiers.AccessSpecifierMethods {

    @Override
    protected void protectedMethod() {
        super.protectedMethod(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void publicMethod() {
        super.publicMethod(); //To change body of generated methods, choose Tools | Templates.
    }        
 
    // defaultMethod from base class AccessSpecifierMethods is not accessible here.
    
    // privateMethod from base class AccessSpecifierMethods is not accessible here.
    
}
