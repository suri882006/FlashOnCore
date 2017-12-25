/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

import java.io.IOException;

/**
 *
 * @author Suraj
 */
public class StringUsage {
    
    // Thread safe mutable
    StringBuffer stringBuffer = new StringBuffer();
    
    // Not thread safe and mutable
    StringBuilder  stringBuilder = new StringBuilder();
    
    String asd="";
    Double c;
    
    public void usage() {
        stringBuffer.append("Suraj");
        stringBuffer.setLength(0);                     
    }
    
    
    
}
