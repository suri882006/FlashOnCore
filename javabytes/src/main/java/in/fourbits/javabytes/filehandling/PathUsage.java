/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.filehandling;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Suraj
 */
public class PathUsage {
    
    public static void main(String[] args) {
        Path path = Paths.get("d:\\FilesUsage\\asd.txt");
        System.out.println(" filename ==> "+path.getFileName());
        System.out.println(" getFileSystem ==> "+path.getFileSystem());
        System.out.println(" getName[0] ==> "+path.getName(0));
    }        
    
}
