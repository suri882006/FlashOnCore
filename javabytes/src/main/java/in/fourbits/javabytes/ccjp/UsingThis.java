/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 *
 * @author Suraj
 */
public class UsingThis {
    
    private final int id;
    public UsingThis(int id) {
        this.id = id;        
    }
    public void update(int newId) {
        //id = newId;   // compilation fails as as final variable cannot be reinitialized        
    }   // Using this is not necessary incase variable id was not final
    
    public static void main(String[] args) {
       UsingThis usingThis = new UsingThis(12);
       usingThis.update(45);
        System.out.println(usingThis.id);
    }    
}
