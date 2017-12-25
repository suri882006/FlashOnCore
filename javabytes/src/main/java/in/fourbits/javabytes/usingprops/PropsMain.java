/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.usingprops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class PropsMain {
    
    static Properties p = new Properties();
    
    public static void main(String[] args) {
        File f = new File("F:\\workspace\\propsmain.properties");
        try {
            FileInputStream fileInputStream = new FileInputStream(f);
            p.load(fileInputStream);
            System.out.println("key ---> "+p.get("name"));
            System.out.println("CurrentThread ---> "+Thread.currentThread().getName());           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PropsMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PropsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
