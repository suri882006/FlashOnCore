/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *
 * @author Suraj
 */
public class SomeClass {
    private int value = 1;
    
    public int getValue() {
        return value;
    }
    
    public void changeVal(int value) {
//        this.value = value;   // This is required now prints 2
        value=value;    // assigning to itself so it prints 1
        Boolean.valueOf("asd");
    }

    public static void main(String args[]) {
        int a = 2;
        SomeClass c = new SomeClass();
        c.changeVal(a);
        System.out.print(c.getValue());
    }
}

