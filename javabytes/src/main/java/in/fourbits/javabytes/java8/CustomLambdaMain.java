/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.java8;

/**
 *
 * @author hp
 */
public class CustomLambdaMain {
    
    public static void main(String[] args) {
        
        CustomLambda addLambda;
        addLambda = (a,b) ->  {
            return a+b; 
          }; 
        System.out.println(addLambda.add(2, 3));
    }
    
}
