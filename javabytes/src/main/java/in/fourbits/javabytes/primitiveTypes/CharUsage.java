/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.primitiveTypes;

/**
 *
 * @author Suraj
 */
public class CharUsage {
    
    public static void main(String[] args) {
        String input = "Suraj";
        char[] inputArray = input.toCharArray();
        inputArray[1] = '\0';
        System.out.println("new String --> "+new String(inputArray));
    }
    
}
