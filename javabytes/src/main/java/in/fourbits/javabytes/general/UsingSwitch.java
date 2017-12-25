/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *
 * @author Suraj
 */
public class UsingSwitch {

    public static void main(String[] args) {
        int i = 2;
        int temp;
        switch (i) {

            // Below statement is illegal multiple values in cases is not allowed
            //case 2,2: System.out.println("2,3");

            // Expression evaluation is possible as switch case
            case 2 + 5:
                System.out.println("2,3");
            case 4:
                break;
        }

        // this runs 1,2,3 as there is no break after 1 and 2. If no break is used then control flows untill break is found
        i = (1 > 1) ? 2 : 1;
        // i=20; If none of case matches like in this case 20 then none of the cases are executed
        switch (i) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
                //break;
            case 3:
                System.out.println(3);
                break;
        }
        //System.out.println(" temp --> "+temp);   
    }    
}
