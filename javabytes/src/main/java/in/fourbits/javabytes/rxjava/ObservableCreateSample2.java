/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;

/**
 *
 * @author hp
 * https://dzone.com/articles/creating-an-observable-in-rxjava
 */
public class ObservableCreateSample2 {
    
    public static Observer<String> construct() {
        return new Observer<String>() {

            @Override
            public void onSubscribe(Disposable dspsbl) {
                System.out.println("subscribed ===> ");
            }

            @Override
            public void onNext(String t) {
                System.out.println("to upper ==> "+t.toUpperCase());
            }

            @Override
            public void onError(Throwable thrwbl) {
                System.out.println("Oops sorry on error");
            }

            @Override
            public void onComplete() {
                System.out.println("Aah now its complete");
            }
            
        };
    }
    
    public static void main(String[] args) {
        Observable observable = Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(ObservableEmitter<String> oe) throws Exception {
                oe.onNext("Suraj");
                oe.onComplete();
            }
        });
        
        observable.subscribe(construct());
}
}
