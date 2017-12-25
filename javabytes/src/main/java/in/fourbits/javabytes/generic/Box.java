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
public interface Box<T> {
    public T get();
    public void put(T element);
    public void pack(Box<? super String> element);
}
