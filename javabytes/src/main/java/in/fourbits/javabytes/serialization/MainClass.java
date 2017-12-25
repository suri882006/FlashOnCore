/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class MainClass {
    
    SerializableClass hashMapClass = new SerializableClass();
    
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        try {
            MainClass mainClass = new MainClass();
            File f = new File("f:\\hampserialize.txt");
            try {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                mainClass.hashMapClass.construct();
                oos.writeObject(mainClass.hashMapClass);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("############## Now reading hashMap from file");
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fin);
            SerializableClass hashMapClassRead = (SerializableClass)ois.readObject();
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("sizeeeeee--> "+hashMapClassRead.toString());
            for(Map.Entry<String,String> entry:hashMapClassRead.hashMap.entrySet()) {
                System.out.println("Key --> "+entry.getKey()+" value --> "+entry.getValue());
            }
        } catch (IOException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
