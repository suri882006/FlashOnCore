/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.stringHandling;

/**
 *
 * @author hp
 */
public class StringBufferMutable {
    
    StringBuffer stringBuffer = new StringBuffer("suraj");
    StringBuilder str1 = new StringBuilder("acharya");
    
    public static void main(String[] args) {
        StringBufferMutable stringBufferMutable = new StringBufferMutable();
        stringBufferMutable.thread1Call(stringBufferMutable.str1);
        stringBufferMutable.thread2Call(stringBufferMutable.str1);
        System.out.println("fina ===> "+stringBufferMutable.stringBuffer);
        
    }
    
    public void thread1Call(StringBuilder strbuff) {
    Thread t1 = new Thread(new Runnable() {

        @Override
        public void run() {
            //strbuff.append("from thread 1");
            updateBuffer(strbuff, "from thread 1");
        }
    }); 
    t1.start();
    System.out.println(strbuff.toString());
    }
    
    public void thread2Call(StringBuilder strbuff) {
    Thread t2 = new Thread(new Runnable() {

        @Override
        public void run() {
            //strbuff.append("from thread 2");
            updateBuffer(strbuff, "from thread 2");
        }
    });    
    t2.start();
    
    }
    
    
    public void updateBuffer(StringBuilder strbuff, String app) {
        strbuff.append(app);
        System.out.println(strbuff.toString());
    }
    
    
    
}
