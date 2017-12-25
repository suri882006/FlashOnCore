/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;


/**
 *  Using varArgs with ... elipses as method param
 * @author Suraj
 */
public class UsingVarArgs {
    
    public static void main(String[] args) {
        UsingVarArgs usingVarArgs = new UsingVarArgs();
        byte b = 0b0000111;
        
        int[] intArr1 = new int[]{1,2,3,4};
        usingVarArgs.calculateSum(1,2,3);   // Varargs can be called with similar type of n number of args which will be converted
        // to an array in calculateSum method
        usingVarArgs.calculateSum(intArr1); // we can also pass array
        System.out.println("b --> "+b);
        
        byte b1=2, b2=3;
        //byte b3 = b1 + b2;
        
    }
    
    /**
     * 
     * @param intArr is nothing but an array of int
     * @return 
     */
    public int calculateSum(int... intArr) {
        int sum = 0;
        for(int i: intArr) {
            sum+=i;
        }
        return sum;
    }
    
}
