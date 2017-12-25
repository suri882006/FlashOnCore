/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Suraj
 */
public class UsingDate {
    
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date --> "+date);
        Date startDate = new Date(0);
        System.out.println("startDate --> "+startDate);
        
        List<? extends Number> numberList = new ArrayList<>();
        List<Integer> IntegerList = new ArrayList<>();
        IntegerList.add(1);
        Number asd = new Integer(10);
        ((List<Integer>)numberList).add(2); 
        
        UsingDate ud = new UsingDate();
        ud.addElements(numberList);
        for(Number n:numberList) {
            System.out.println("n integer --> "+n);
        }
        
    }
    
    public void addElements(List<? extends Number> numList) {
        ((List<Number>)numList).add(1);
        ((List<Number>)numList).add(2);
    }
    
}
