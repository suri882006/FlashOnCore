/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 *
 * @author Suraj
 */

    class Vehicle1 {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car1 extends Vehicle1 {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike1 extends Vehicle1 {
    public void printSound() {
        System.out.print("bike");
    }
}


 


public class InheriTtest {
    public static void main(String[] args) {
        Vehicle1 v = new Car1();
        Bike1 b = (Bike1) v;
        
        v.printSound();
        b.printSound();
    }   
}
    

