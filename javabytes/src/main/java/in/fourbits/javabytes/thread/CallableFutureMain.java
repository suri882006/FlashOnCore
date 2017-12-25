/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * callable is similar to Runnable except that it returns a value
 * https://stackoverflow.com/questions/35329845/difference-between-completablefuture-future-and-rxjavas-observable/35347215
 * @author hp
 */
public class CallableFutureMain implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return Thread.currentThread().getName();
    }
    
    public static void main(String[] args) throws InterruptedException {
        Callable callable = new CallableFutureMain();
        ExecutorService executorService = Executors.newFixedThreadPool(30);
        
        Future<String> futureValue = executorService.submit(callable);
        System.out.println("after submit");
        try {
            System.out.println("value ---> "+futureValue.get());
        } catch (ExecutionException ex) {
            Logger.getLogger(CallableFutureMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("continuing further");
    }
    
}
