/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.networking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suraj
 */
public class UrlInfo {
    
    public static void main(String[] args) throws MalformedURLException {
       //URL url = new URL("http://www.fourbits.in/hello?info=true");
        URL url = new URL("http://developer.gstsystem.co.in/pages/apiportal/data/Returns/GSTR1%20-%20Save%20GSTR1%20data/v0.3/GSTR1%20-%20Save%20GSTR1%20data%20request_schema.json");
       //URL url = new URL("http://www.google.in");
        System.out.println(" url ===> "+ url.toExternalForm());
        System.out.println("host "+url.getHost());
        System.out.println("Query "+url.getQuery());
        System.out.println("protocol "+url.getProtocol());        
        System.out.println("port "+url.getPort());       
        System.out.println("default port "+url.getDefaultPort());
        
        try {
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            assert(code == 200);
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            int data = isr.read();
            File f = new File("f:\\schema.json");
            FileOutputStream fos = new FileOutputStream(f);
            //fos.write(isr.read());
            while(data!=-1) {
                //System.out.print(ch);
                
                fos.write((char)data);
                data = isr.read();
            }
            fos.close();
            System.out.println("code --> "+code);
            connection.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(UrlInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
