/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.accessSpecifiers;

/**
 * This class has 4 methods defined for each access specifier public,default,protected,private
 * @author Suraj
 */
public class AccessSpecifierMethods {
    
    protected void protectedMethod()
    {
        System.out.println(" in protected method of class AccessSpecifierMethods");
    }
    
    public void publicMethod()
    {
        System.out.println(" in public method of class AccessSpecifierMethods");
    }
    
    private void privateMethod()
    {
        System.out.println(" in private method of class AccessSpecifierMethods");
    }
    
    void defaultmethod()
    {
        System.out.println("default method of class AccessSpecifierMethods");
    }
    
}
