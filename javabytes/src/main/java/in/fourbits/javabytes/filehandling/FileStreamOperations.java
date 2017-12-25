/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.filehandling;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
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
public class FileStreamOperations {
    
    public static void usingFileWriter() {
        File  file = new File("d:/java_filehandling/read2.txt");
        try {            
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello rewriting the contents to file");                        
            fileWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(FileStreamOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void usingFileReader() {
        File  file = new File("d:/java_filehandling/read2.txt");
        char[] charArray = new char[500];
        int ch;
        try {            
            FileReader fileReader = new FileReader(file);    
            // Reading the charecter to array
            System.out.println("read char --> "+fileReader.read(charArray));
            System.out.print("Reading the charecter to array --> ");    
            for(char c:charArray) {
            System.out.print(c);    
            }            
            fileReader = new FileReader(file);    
            System.out.print("\nReading one charecter at a time --> ");
            while((ch= fileReader.read())>=0) {
            System.out.print((char)ch);        
            }
            System.out.println("");
            
        } catch (IOException ex) {
            Logger.getLogger(FileStreamOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /** 
     * TODO: to be implemented
     */
    public static void usingFileOutputStream() {
        File  file = new File("d:/java_filehandling/read2.txt");
        try {            
            FileOutputStream fileOutputStream = new FileOutputStream(file);                      
            Logger.getLogger(FileStreamOperations.class.getName()).log(Level.SEVERE, "asdasdasd", 123);
        } catch (IOException ex) {
            Logger.getLogger(FileStreamOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void usingObjectOutputStream() {
        File  file = new File("d:/java_filehandling/EmployeeObject.txt");
        try {     
            // Append the contents to end of file
            FileOutputStream fileOutputStream = new FileOutputStream(file,false);                                                            
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);             
            for(int i=0;i<10;i++) {
            objectOutputStream.writeObject((new Employee(i,"Suraj34","Mangalore453","1233")));                                    
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FileStreamOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void usingObjectInputStream() {
        File  file = new File("d:/java_filehandling/EmployeeObject.txt");
        //Employee employee = null;
        try {                 
            FileInputStream fileInputStream = new FileInputStream(file);                 
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);                  
            //System.out.println("read ==> "+objectInputStream.);
            while(objectInputStream.available()>=0) {
                Employee employee = (Employee) objectInputStream.readObject();                                                            
                
            // Employee Id is printed as zero as it is set to transient    
            System.out.println("content read from serialized file --> "+employee.toString());
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileStreamOperations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EOFException eof) {
            //Logger.getLogger(FilePropertes.class.getName()).log(Level.SEVERE, null, eof);
        } catch (IOException ex) {            
            ex.printStackTrace();
            Logger.getLogger(FileStreamOperations.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    public static void main(String[] args) {      
        usingFileWriter();
        usingFileReader();
        usingFileOutputStream();
        usingObjectOutputStream();
        usingObjectInputStream();
    }
    
}
