/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.serialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hp
 */
public class SerializableClass implements Serializable{
    
    public HashMap<String,String> hashMap = new HashMap<String,String>();
    
    public List<String> list = new ArrayList<String>();
    
    public void construct() {
        hashMap.put("one","1");
        hashMap.put("two","2");
        hashMap.put("three","3");
        hashMap.put("four","4");
        
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");
        list.add("elem4");
    }
    
    @Override
    public String toString() {
        return "HashMapClass{" + "hashMap=" + hashMap + ", list=" + list + '}';
    }
    
}
