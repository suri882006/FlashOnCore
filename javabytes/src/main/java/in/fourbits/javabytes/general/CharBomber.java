/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 * 
 *
 * @author Suraj
 */
public class CharBomber {

    public static void main(String[] args) {

        CharBomber bomber = new CharBomber();
        System.out.println(" outer --> " + bomber.BomberAlgo("aabcccdee".toCharArray())); // bd
        System.out.println(" outer --> " + bomber.BomberAlgo("abcdeedcbfgh".toCharArray())); // afgh
        System.out.println(" outer --> " + bomber.BomberAlgo("abcdeedcbfgf".toCharArray())); // afgf
        System.out.println(" outer --> " + bomber.BomberAlgo("abbabba".toCharArray())); // a
        
    }

    /**
     * 
     * @param inputArray
     * @return 
     */
    public String BomberAlgo(char[] inputArray) {
        int currentPosition = 0;
        char recentMatchChar = '\0';
        int recentMatchPos = 0;
        int inputArrayLength = inputArray.length;
        boolean exists = false;
        while (currentPosition < inputArrayLength - 1) {
            if (inputArray[currentPosition] == '\0') {
            } else {
                if (inputArray[currentPosition] != inputArray[currentPosition + 1]) {
                    if (recentMatchChar == inputArray[currentPosition]) {
                        inputArray[currentPosition] = '\0';
                        inputArray[recentMatchPos] = '\0';
                        exists = true;
                    }
                    recentMatchChar = inputArray[currentPosition];
                    recentMatchPos = currentPosition;
                } else {
                    exists = true;
                    recentMatchChar = inputArray[currentPosition];
                    recentMatchPos = currentPosition;
                    inputArray[currentPosition] = '\0';
                    inputArray[currentPosition + 1] = '\0';
                }
            }
            currentPosition ++;
        }
        if (exists) {
            BomberAlgo(inputArray);
        }
        return new String(inputArray).trim().replaceAll("\0", "");
    }   
    
//    public static String BomberAlgo(char[] inputArray) {
//        int pos = 0;
//        char recentMatchChar = '\0';
//        int recentMatchPos = 0;
//        boolean exists = false;
//        // abcdeedcbfgh
//        while (pos < inputArray.length - 1) {
//            if (inputArray[pos] == '\0') {
//                pos++;
//            } else {
//                if (inputArray[pos] != inputArray[pos + 1]) {
//
//                    if (recentMatchChar == inputArray[pos] && recentMatchChar != '\0') {
//                        //System.out.println(" char pos -->"+recentMatchChar +" inp arry -->"+inputArray[pos] +" pos --> "+pos);
//                        inputArray[pos] = '\0';
//                        inputArray[recentMatchPos] = '\0';
//                        //System.out.println(" pp --> "+inputArray[pos]);
//                        exists = true;
//                    }
//                    if (inputArray[pos] != '\0') {
//                        recentMatchChar = inputArray[pos];
//                        recentMatchPos = pos;
//                    }
//                    pos++;
//                } else {
//                    if (inputArray[pos] != '\0') {
//                        recentMatchChar = inputArray[pos];
//                        recentMatchPos = pos;
//                    }
//                    exists = true;
//                    inputArray[pos] = '\0';
//                    inputArray[pos + 1] = '\0';
//                    pos++;
//                }
//            }
//        }
//        if (exists) {
//            BomberAlgo(inputArray);
//        }
//        return new String(inputArray);
//    }   
}
