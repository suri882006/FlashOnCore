/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

/**
 *
 * @author Suraj
 */
public class InterfaceImplMain {    
    public static void main(String[] args) {
        Interface1 Obj=new Interface1Impl();
        Obj.defaultMethod();
        System.out.println("-------------------------------------------------");
        Obj.publicMethod();
        System.out.println(new Interface1() {

            @Override
            public void defaultMethod() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void publicMethod() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
    }    
}
