/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.constructorsUsage;

/**
 * If both default and parameterized constructor exists the parameterized takes a precedence and default never gets executed
 * Unless you explictly call as first statement in parameterized constructor
 * @author Suraj
 */
public class ConstructorTypes {

    String str;
    int value;
    
    public ConstructorTypes() {
        System.out.println("in default constructor");
        str+=" world";
    }
    
    // Allowed now illegal as it is already defined as above
//    private ConstructorTypes() {
//        
//    }
    
    public ConstructorTypes(int value) {        
        this();
        System.out.println(" in parameterized constructor");        
        this.value=value;                
    }
    
    void Temp(int i) {       
        // This type of expression is right
        String a = (1==1)? "1":2==2?"2":"3";
        
        boolean b2= false;
        
        // This works as b2 is of type boolen
        if(b2=false) {
            
        }
        
        // this is illegal
//        if(1=2) {
//            
//        }
    }
    
    public static void main(String[] args) {
        ConstructorTypes constructorTypes = new ConstructorTypes(12);
        
    }
    
}
