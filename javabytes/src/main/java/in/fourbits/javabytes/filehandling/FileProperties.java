/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.filehandling;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.ObjectOutputStream;

/**
 *
 * @author Suraj
 */
public class FileProperties {
    
    public static void displayFileProperties() {
        File file = new File("d:/java_filehandling/read.txt");
        System.out.println("is dir --> "+file.isDirectory());
        System.out.println("is exists --> "+file.exists());
        System.out.println("file path --> "+file.getPath());        
    }
    
    public static void createFile() {
        File  file = new File("d:/java_filehandling/read2.txt");
        try {
            System.out.println("file creation status --> "+file.createNewFile());            
        } catch (IOException ex) {
            Logger.getLogger(FileProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        displayFileProperties();
        createFile();
    }
}
