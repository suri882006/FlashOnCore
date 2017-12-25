/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

/**
 *
 * @author Suraj
 */
public class InterfaceMain {
    
    public static void main(String[] args) {
     
        SampleInterfaceClass IntfObj=new clsSampelInterfaceClass();
        IntfObj.displayMethod();
        IntfObj.setData();
        System.out.println(" val from interfaces ==> "+SampleInterfaceClass.miIntVal);
        
        SampleIntfClass ClassObj=new clsSampelInterfaceClass();
        ClassObj.displayMethod();
//        ClassObj.setData();
        System.out.println("*********************");
        InterfaceMain Obj22=new InterfaceMain();        
        InterfaceMain.clsSampelInterfaceClass Obj=new clsSampelInterfaceClass();
        Obj.displayMethod();
//        Obj22.main(args);   // This causes stackoverflow errot
    }
    
    public static class clsSampelInterfaceClass extends SampleIntfClass implements SampleInterfaceClass // extends should follow implements else error
    {
        @Override
        public void displayMethod() {
            System.out.println(" in display method of interface");
        }

        @Override
        public void setData() {
            System.out.println(" in set data method of interface");
        }                
    }
    
}
