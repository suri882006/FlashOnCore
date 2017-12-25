/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.comparables;

import in.fourbits.javabytes.comparators.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Suraj
 */
public class ComparatorMain {
    
    public static List<Person> personList = new ArrayList<Person>();
    
    public static void main(String[] args) {
        personList.add(new Person("first" ,"twenty two", 22));
        personList.add(new Person("second" ,"one", 1));
        personList.add(new Person("third" ,"forty five", 45));
        personList.add(new Person("fourth" ,"twelve", 12));  
        Object o = new Object();
        //o instanceof 
        
        Collections.sort(personList, new Comparator<Person> () {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getUuid().compareTo(o2.getUuid());
            }                                    
        } );
        
        for(Person person :personList) {
            System.out.println(person.toString());
        }            
    }
    
}
