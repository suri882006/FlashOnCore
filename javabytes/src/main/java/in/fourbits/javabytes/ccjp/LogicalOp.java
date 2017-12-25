/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 *
 * @author Suraj
 */
public class LogicalOp {
    
    public static void main(String[] args) {
        int rank =0;
        int count =0;
        
        if(((5<7) || (++count < 10)) | rank++ <10 ) rank =rank +1;
        if((6>8) ^ false) rank =rank +10;
        if(!(rank>1) && ++count>1) rank =rank +100; // !(rank>1) is evaluated to false so second && condition is never evaluated
        //if((rank>1) && ++count>1) rank =rank +100;    // (rank>1) is evaluated to true so second && condition is evaluated
        System.out.println(" rank "+rank+" count "+count);
    }
    
}
