/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author hp
 */
public class Java8Lists {
    
    private static List<String> list = new ArrayList<>();
    
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list = list.stream().map(data -> data.toUpperCase()).collect(Collectors.toList());
        
        list.forEach(data -> System.out.println(data));
        Optional<String> opt = list.stream().findAny();
        System.out.println("opt val --> "+opt.orElse("NOt found"));
        UUID uid = UUID.randomUUID();
        System.out.println("uid ---> "+uid);
        //List uppercaseList = (List) 
        
    }
    
}
