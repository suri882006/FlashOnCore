/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.stringHandling;

/**
 *
 * @author Suraj
 */
public class StringMain {
    
    public static void main(String[] args) {
      String a="asd";
      String b="asd";
      
        System.out.println("a==b --> "+a==b);
        System.out.println(a==b);
        System.out.println("a ==> "+a+" b==> "+b);
        a=a.substring(0, 0);
        //a="123";
        System.out.println("a ==> "+a+" b==> "+b);
        String Obj=new String();
        
        for(int i = 0; i < 2; i++) {
         for(int j = 2; j>= 0; j--) {
            if(i == j) break;
            System.out.println("i=" + i + " j="+j);
         }
      }
        
       System.out.print(" " + (7 + 2) + " ");
        int a1 = 3;
        int b1 = 4;
       System.out.print(a1 + b1);
              
        
    }
    
}
