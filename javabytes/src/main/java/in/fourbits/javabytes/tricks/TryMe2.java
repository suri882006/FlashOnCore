/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.tricks;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Suraj
 */
public class TryMe2 {
    public static void main(String args[]) {
        List list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        
        Collections.reverse(list);
        Iterator iter = list.iterator();
        String asd="123";
        asd.length();
        
//        for (Object o : iter) {   // Error iter cannot be used as it takes only array or list
//            System.out.print(o + " ");
//        }
    }
}
