/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.ccjp;

/**
 * Using this and not using this keyword in constructor. If we do not use this and we directly use x=x then Object's value x
 * does not get updated
 * .equals() only compares the value within the object
 * == compares the object references if they point to same location, returns true if same reference, false otherwise
 * There is a difference between String literal and String Object (StringPool and heap memory)
 * @author Suraj
 */
public class UsingThis2 {
    
    private int x;
    private int y;
    public Integer int1 = 12;
    public Integer int2 = 14;
    public String str1 ="hi";
    public String str2 ="hi";
    public String strObj = new String("hi");
    public UsingThis2(int x, int y) {
        x=x;
    }
    
    @Override
    public String toString() {
        return "[" +x+","+y+"]";
        
    }    
    
    public static void main(String[] args) {
       UsingThis2 usingThis2 = new UsingThis2(12,14);       
        System.out.println(usingThis2.toString());
        System.out.println(" int1 equals int2 -> "+usingThis2.int1.equals(usingThis2.int2));
        System.out.println(" int1 == int2 -> "+(usingThis2.int1==usingThis2.int2));
        System.out.println("---------------------------------------------------");
        System.out.println(" str1 equals str2 -> "+usingThis2.str1.equals(usingThis2.str2));
        System.out.println(" str1 == str2 -> "+(usingThis2.str1==usingThis2.str2));
        System.out.println("---------------------------------------------------");
        System.out.println(" str1 equals strObj -> "+usingThis2.str1.equals(usingThis2.strObj));
        System.out.println(" str1 == strObj -> "+(usingThis2.str1==usingThis2.strObj));
        
    }    
}
