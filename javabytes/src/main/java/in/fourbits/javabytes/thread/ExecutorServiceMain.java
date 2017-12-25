/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.thread;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Using ExecutorService lets us to run a method simultaneously for for a fixed number of threads
 * @author hp
 */
public class ExecutorServiceMain {
    
    
    
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(30);
        String[] hostList = { "https://www.googl1e.in", "https://www.facebook.com" };
        
        for(String host :hostList) {
            executorService.execute(() -> {
                try {
                    URL url = new URL(host);
                    HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.connect();
                    int code = httpURLConnection.getResponseCode();
                    if(code == 200) {
                        System.out.println("URL --> "+host+" ---> "+"GREEN");
                    }
                } catch (MalformedURLException ex) {
                    // Logger.getLogger(ExecutorServiceMain.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("URL --> "+host+" ---> "+"RED");
                } catch (IOException ex) {
                    //Logger.getLogger(ExecutorServiceMain.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("URL --> "+host+" ---> "+"RED");
                }
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ExecutorServiceMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }
        executorService.shutdown();
            
    }
    
}
