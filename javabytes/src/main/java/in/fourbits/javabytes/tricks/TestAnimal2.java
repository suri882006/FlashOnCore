/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.tricks;

/**
 *
 * @author Suraj
 */
public class TestAnimal2 {
public static void main (String [] args) {
Horse1 h = new Horse1();
//h.eat(); // Not legal because Horse didn't inherit eat()
Animal1 Obj=new Horse1();
//Obj.
}
}
class Animal1 {
private void eat() {
System.out.println("Generic Animal Eating Generically");
Object Obj=new Object();
Integer i2 = new Integer(42);
}
}
class Horse1 extends Animal1 { 
    public void asd()
    {
        System.out.println("asd");
    }
}
