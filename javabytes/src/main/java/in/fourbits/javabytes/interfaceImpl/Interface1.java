/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

/**
 * Just trying out with interfaces, Interfaces cannot be instantiated
 * @author Suraj
 */
public interface Interface1 {
    
    public int Inf1Val=40;  // Interface member variables are by default static and final variables even though you specify it or not
                          // Note variable here cannot be private  
    
//    private void privateMethod();   // private methods are not allowed here
//    protected void protectedMethod(); // protected methods are not allowed here
      void defaultMethod();         
      abstract public void publicMethod();      // Mentioning abstract keyword here is optional
      
//      public Interface()      // As interfaces consists of abstract methods it cannot be instantiated
//      {
//          
//      }
    
    
}
