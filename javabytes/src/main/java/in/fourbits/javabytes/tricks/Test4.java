/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.tricks;

/**
 *
 * @author Suraj
 */
public class Test4 {
    
    private boolean mbVal;
    public Test4()
    {
        System.out.println(" in constructror");
        String s="asd";
        if(s instanceof String)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
    
    static {
        System.out.println("from static");
    }
    public static void main(String[] args) throws Throwable {
        
        try{
            Test4 Obj=new Test4();
            assert (1>2);
            System.out.println("in main");
        }finally
        {
            
        }
    }

    public boolean isMbVal() {
        return mbVal;
    }

    public void setMbVal(boolean mbVal) {
        this.mbVal = mbVal;
    }
    
}
