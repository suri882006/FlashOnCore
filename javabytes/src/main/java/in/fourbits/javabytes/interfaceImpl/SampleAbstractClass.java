/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.interfaceImpl;

/**
 *
 * @author Suraj
 */
public abstract class SampleAbstractClass implements SampleInterfaceClass {

    public static final int getmStFinalVal() {
        return mStFinalVal;
    }
    
//    protected abstract void m11();
//    
//    synchronized public final void m1() {}
    
    // Modifiers private and protected cannot be applied to abstract class
    
    public SampleAbstractClass()
    {
        System.out.println(" this is a abstract class constructor");
    }
    
    private int mintVal=22;
    private String mStringVal="suraj";
    private static final int mStFinalVal=78;    // Setter is not created as it is final

    public int getMintVal() {
        return mintVal;
    }

    public void setMintVal(int mintVal) {
        this.mintVal = mintVal;
    }

    public String getmStringVal() {
        return mStringVal;
    }

    public void setmStringVal(String mStringVal) {
        this.mStringVal = mStringVal;
    }
    
    public static void justMethod()
    {
        System.out.println(" hey this is just a method defination in abstract class");
    }
    
//    public abstract void abstMethod()     // This is illegal. Abstract methods cannot have body
//    {
//        
//    }
    
//    public  void abstract abstMethod(); // This is llegal
    public abstract void abstMethod();    
}
