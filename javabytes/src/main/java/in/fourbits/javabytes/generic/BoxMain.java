/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * https://www.ibm.com/developerworks/library/j-jtp04298/index.html
 * http://tutorials.jenkov.com/java-generics/wildcards.html
 * @author hp
 */
public class BoxMain {
    
    public static void main(String[] args) {
        Box<Integer> bint = new BoxImpl<Integer>();
        Box<Double> bdouble = new BoxImpl<Double>();
        List<String> str = new ArrayList<String>(Arrays.asList("z", "b", "a"));
        Box<String> bstr = new BoxImpl<String>();
        bint.put(34);
        bdouble.put(39.23);
        System.out.println("bintget ===> "+bint.get());
        //System.out.println("bintget ===> "+unbox(bint));
        //unbox(bint);
        
        str.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if(o1.compareTo(o2)>1) {
                    return 1;
                } else if(o1.compareTo(o2)<0) {
                    return -1;
                } 
                return 0;
            }
            
        });
        
        str.stream().forEach(a -> System.out.println(a));
        str = str.stream().filter((String t) -> !t.equals("a")).collect(Collectors.toList());
        str.stream().forEach(a -> System.out.println(a));
        bint.pack(bstr);
        str.forEach(System.out::println);
        str.stream().forEach(System.out::println);
    }
    
    
    public static void unbox(Box<? extends Number> box) {
        System.out.println("box unbox --->"+ box.get());
        //return box.get();
    }
    
}
