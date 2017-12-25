/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 *
 * @author Suraj
 */

class A {
    
}
class B extends A {
    
}
class C extends B {
    
}

public class InheritanceInstanceOf extends A {
    public static void main(String[] args) {
        A obj= new B();
        System.out.println("Obj inst B" +(obj instanceof B));
        System.out.println("Obj inst InheritanceInstanceOf" +(obj instanceof InheritanceInstanceOf));
        System.out.println("Obj inst C" +(obj instanceof C));
    }
}
