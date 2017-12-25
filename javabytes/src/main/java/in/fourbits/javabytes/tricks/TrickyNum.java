/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.tricks;

/**
 *
 * @author Suraj
 */
public class TrickyNum<X extends Object> {
    
    private X x;
    
    public TrickyNum(X x) {
        this.x = x;
    }
    
    private double getDouble() {
//        return x.doubleValue();
        return ((Double) x).doubleValue();
    }
    
    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
        Double a1=null;
        a1.doubleValue();
        
        
    }
}
