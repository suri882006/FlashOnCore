package in.fourbits.javabytes.quartz;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        int[][] source = new int[6][6];
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        for(int i=0; i<6 ;i++) {
            for(int j=0; j<6;j++) {
                source[i][j] = in.nextInt();    
            }
        }
		
        int currentSum = 0;
		int finalVal =0;
        for(int i=0; i<6-2 ;i++) {
		currentSum =0;
            for(int j=0; j<6-2;j++) {
			currentSum =0;
					for(int k=j; k<j+3; k++) {
					currentSum+=source[i][k];
					if(k==0 || k==2 || k==3 || k==5) {
						// SIde bars
						currentSum+=source[i+2][k];
					} else {
						currentSum+=source[i+1][k];
						currentSum+=source[i+2][k];
					}
				}
				System.out.println("i ==> "+i+" j===> "+j+" currentsum ==> "+currentSum+" finalVal ===> "+finalVal);	
				if(currentSum > finalVal) {
					finalVal = currentSum;
				}
			}
		}
		
		System.out.println(finalVal);
    }
}
