/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author hp
 */
public class StrIntMain {
    
    private List<Student> stdList = new ArrayList<>();
    private List<Faculty> facList = new ArrayList<>();
    public static void main(String[] args) {
        
        StrIntMain obj = new StrIntMain();
        obj.stdList.add(new Student(1, "suraj1", "bca1"));
        obj.stdList.add(new Student(2, "suraj2", "bca2"));
        obj.stdList.add(new Student(3, "suraj3", "bca3"));
        
        obj.facList.add(new Faculty(1, "Fac1", "bca1", "pf1"));
        obj.facList.add(new Faculty(2, "Fac2", "bca2", "pf2"));
        obj.facList.add(new Faculty(3, "Fac3", "bca3", "pf3"));
        
        StrIntGen<Student> studentGen = new StrIntGen<>();
        System.out.println(studentGen.elementExists(obj.stdList, new Student(1, "suraj1", "bca1")));
        
        Student obj1;
        assert(Objects.isNull(obj));
        
        
        
    }
    
    
    
}
