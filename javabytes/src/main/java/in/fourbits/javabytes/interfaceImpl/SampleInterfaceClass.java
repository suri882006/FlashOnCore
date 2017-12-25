/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

/**
 *
 * @author Suraj
 */
public interface SampleInterfaceClass {
    
    public int miIntVal=89;  // Private modifiers not allowed here   also this field cannot be encapsulated as it is in a interface
    
    public static int miStVal=0;    
    
    static final int miStFinalVal=0;   
    
//    public final void displayMethod();  // Modifiers final not allowed here as this need to be implemented
    
    public abstract void displayMethod();
    
    public abstract void setData();
    
}
