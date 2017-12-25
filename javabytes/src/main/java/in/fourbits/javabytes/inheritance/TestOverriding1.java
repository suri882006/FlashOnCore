/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 *
 * @author Suraj
 */
public class TestOverriding1 {
    public static void main(String aga[]){
        Parrot bird=new Parrot();
        Bird b1 = new Parrot(); // Legal
        b1.fly();
        //b1.dostuff(); // not accessible
        Parrot p1 = new Parrot();
        p1.fly();
        p1.doStuff();
        //bird.fly();        
    }
}
class Bird{
     public  void fly(){
        System.out.println("Bird is flying");
    }
}
class Parrot extends Bird{
    public void fly() {
        System.out.println("parrot fly");
    }
    public void doStuff(){
        System.out.println("I am parrot , and I am doing stuff");
    }
}
