/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.generic;

/**
 *
 * @author hp
 * @param <T>
 */
public class BoxImpl<T> implements Box<T> {
    
    T currentVal;

    @Override
    public T get() {
        return currentVal;
    }

//    @Override
//    public void put(Integer element) {
//        this.currentVal = element;
//        System.out.println(" in put");
//    }
//
//    @Override
//    public void unbox(Box<?> element) {
//        //element.
//        
//    }

    @Override
    public void put(T element) {
        this.currentVal = element;
        System.out.println(" in put");
    }

    @Override
    public void pack(Box<? super String> element) {
        element.put("2");
    }
    
    
}
