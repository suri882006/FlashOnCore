/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.rxjava;

import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Observable can be created from an Array, Iterable, Future, etc... Observable
 * are things that will be published as items to which subscribers can
 * subscribe. In subscribe we have 3 parameters 1-subscribe action 2-Error
 * 3-OnComplete
 *
 * https://medium.com/@milenko_52829/understanding-java-rxjava-for-beginners-5eacb8de12ca
 *
 * @author hp
 */
public class ObservableSample1 {

    public static void main(String... args) {
        String[] names = {"suraj", "acharya"};
        Observable.fromArray(names).subscribe((String t) -> {
            System.out.println("hello --> " + t);
        });

        Observable.fromArray(names).subscribe((String t) -> {
            throw new Exception();
        }, new Consumer<Throwable>() {

            @Override
            public void accept(Throwable t) throws Exception {
                System.out.println("error");
            }

        });
        Iterable<String> iterable = new ArrayList(Arrays.asList("one", "two"));
        Observable.fromIterable(iterable).subscribe(t -> {
            //throw new Exception();
        }, t -> {
            System.out.println("Error block");
        }, () -> {
            System.out.println("Now its complete - WIll reach here only if there is no error");
        });

    }
}
