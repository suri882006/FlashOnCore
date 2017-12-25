/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.accessSpecifiers.package1;

import in.fourbits.javabytes.accessSpecifiers.AccessSpecifierMethods;

/**
 * This class has a method display and we create a instance of AccessSpecifierMethods class from package in.fourbits.javabytes.
 * Note that default,private access specifier methods are however not available here, and even protected access specifier 
 * is also not available, as protected members can be accessed within its own package (as with package-private) and,
 * in addition, by a subclass of its class in another package.
 * @author Suraj
 */
public class OtherPackageInheritAccessSpecObj {
    public void display()
    {
        AccessSpecifierMethods Obj=new AccessSpecifierMethods();
        Obj.publicMethod();
//        obj.protectedMethod();    // Note this is not available here.
    }   
}
