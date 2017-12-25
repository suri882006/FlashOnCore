/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.annotations;

import java.lang.reflect.Method;

/**
 *
 * @author hp
 */
public class CustomAnnotMain {
    public static void main(String[] args) {
        //CustomAnnotMain annotMain = new CustomAnnotMain();
        Method[] m = CustomAnnotMain.class.getMethods();
        for(Method m1 : m) {
            CustomAnnot ca = m1.getAnnotation(CustomAnnot.class);
          if(ca!= null)
            System.out.println("key ---> "+ca.key());
        }
    }
    
    @CustomAnnot(key = "surja")
    public void display() {
        
    }
    
}
