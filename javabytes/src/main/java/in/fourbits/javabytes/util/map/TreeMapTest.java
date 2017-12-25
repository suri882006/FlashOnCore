/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.util.map;

import in.fourbits.javabytes.comparators.Person;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author hp
 */
public class TreeMapTest {
    
    public static void main(String[] args) {
        // Giving a custom comparator implementation
        // Just giving result in classCastException
        //TreeMap<Person,String> map = new TreeMap<Person,String>();
        TreeMap<Person,String> map = new TreeMap<Person,String>(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                if(o1!=null && o2!=null) {
                return (o1.getUuid().compareTo(o2.getUuid()));
                }
                return -1;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        map.put(new Person("f1","f2", 10), "ten");
        map.put(new Person("f1","f2", 14), "fourteen");
        map.put(new Person("f1","f2", 12), "twelve");
        map.put(new Person("f1","f2", 5), "five");
        map.put(null, "null");
        
        for(Map.Entry k: map.entrySet()){
            System.out.println("key --> "+k.getKey()+" value --> "+k.getValue());
        }
    }
    
}
