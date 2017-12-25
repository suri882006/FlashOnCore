/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.tricks;

/**
 *
 * @author Suraj
 */
class Small {
    public Small() {
        System.out.print("a ");
        Double D;
        Integer I;        
    }
    public Small(int t)
    {
        System.out.println(" inside param");
    }
}

class Small2  extends Small {
    public Small2() {
        super(1);
        System.out.print("b ");
        
    }
}

class Small3 extends Small2 {
    public Small3() {
        System.out.print("c ");
    }
}

public class Test3 {     
    public static void main(String args[]) {
        new Small3();
    }
}
