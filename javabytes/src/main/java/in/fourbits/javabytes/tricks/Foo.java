/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.tricks;

/**
 *
 * @author Suraj
 */

public class Foo 
{
    Foo() 
    {
        System.out.print("foo");
    }
    
class Bar
{
    Bar() 
    {
        System.out.print("bar");
    }
    public void go() 
    {
        System.out.print("hi");
    }
} /* class Bar ends */

    public static void main (String [] args) 
    {
        Foo f = new Foo();
        f.makeBar();
    }
    void makeBar() 
    {
        (new Bar() {}).go();
    }
}/* class Foo ends */


