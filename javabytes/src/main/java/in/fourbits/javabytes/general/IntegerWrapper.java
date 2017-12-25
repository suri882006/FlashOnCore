/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *
 * @author Suraj
 */
public class IntegerWrapper {
    
    public static class clsTemp
    {
        public clsTemp(String inName)
        {
            this.mName=inName;
        }
        private String mName;

        public String getmName() {
            return mName;
        }

        public void setmName(String mName) {
            this.mName = mName;
        }
        
    }
    public static void main(String[] args) {
        Object Obj= null;
//        Obj="22";
//        System.out.println(" Obj=> "+Obj); // Prints 22        
//        Obj=new String("Suraj");
//        System.out.println(" Obj=> "+Obj);  // Prints suraj
        Obj= new clsTemp("1");
        System.out.println(" Obj=> "+Obj);  // Prints Object address
        System.out.println(" Obj=> "+(Integer.parseInt(((clsTemp)Obj).getmName())));  // Prints Object address
    }
    
}
