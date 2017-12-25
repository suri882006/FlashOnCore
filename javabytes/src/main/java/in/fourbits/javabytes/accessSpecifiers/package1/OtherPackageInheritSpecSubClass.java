/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.accessSpecifiers.package1;

/**
 * Subclass of OtherPackageInheritAccessSpec which is in turn a subclass of in.fourbits.javabytes.AccessSpecifierMethods
 * from a different package. Even now protected and public methods are accessible.
 * @author Suraj
 */
public class OtherPackageInheritSpecSubClass extends OtherPackageInheritAccessSpec{

    @Override
    protected void protectedMethod() {
        super.protectedMethod(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void publicMethod() {
        super.publicMethod(); //To change body of generated methods, choose Tools | Templates.
    }               
}
