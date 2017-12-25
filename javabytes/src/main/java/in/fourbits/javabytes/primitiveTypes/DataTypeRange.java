/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.primitiveTypes;

/**
 *
 * @author Suraj
 */
public class DataTypeRange {
    
    /**
     * This method to used to check the various range for datatype
     * @param args
     * For Byte range is -128 to 127    1 Byte
     * For short range is -32768 to 32767   2 Bytes
     * For int range is  -2,147,483,648 to 2,147,483,647 4 bytes
     */ 
    public static void main(String[] args) {
//        byte bVar=128;  // This is an precission error
        byte bVar=127; // This is correct
//        short Shortvar=32768;   // This is an precession error
        short Shortvar=32767;   // This is correct
//        int IntVar=12345678910; // This is an precession error
        int IntVar=1234567891; // This is correct
    }                
}
