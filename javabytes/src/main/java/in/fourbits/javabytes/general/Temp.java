/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

import java.util.Arrays;

interface usample {
        int ilength=10;
    }

class asd{
    
}
/**
 *
 * @author Suraj
 */
public class Temp extends asd {
    private static int len =20 ;
    public static void main(String[] args) {
        //len = super().ilength;
        String aa[][][]= new String[2][100000][3];
        Object[] Obj = {new Integer(2),new String("Suraj"), new Boolean(true)};
        System.out.println("len --> "+aa.length +" -- "+Obj.toString());    // result 2
        Temp t = new Temp(2);
        t.len = t.len + 10;
        t.len += --t.len;
        int a,b,c;
        a=b=c=0;
        //Arrays.sort(Obj);
        //System.out.println("obj arr "+Obj[1].toString());
        
        char ascii='A';
        System.out.println("asciii ==> "+ascii + 1);
        System.out.println("asc A "+ (int)ascii);
        System.out.println("asc a "+ (int)'a');
        
        final Object oo = new Object();
        char code1 = '\uFFFF';
        float price = 78.5f;
        System.out.println(" No of processors available for jvm --> "+Runtime.getRuntime().availableProcessors());
    }
    
    Temp() {
        
    }
      Temp(int i) {
        this();
        String a = (1==1)? "1":2==2?"2":"3";
        
        boolean b2= false;
        if(b2=false) {
            
        }
    }          
     
     public float f1(float p1, int p2, float p3) {
         return 0;
     }
     
     public float f1(float p1, float p2, float p3) {
         return 0;
     }
    
}
