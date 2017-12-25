/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 *
 * @author Suraj
 */
public class StaffBase {
    
    String mStaffName;
    String mAddress;
    
    
    /**
     * Making this constructor as private shows an error in sub class constructor as private constructor cannot be accessed
     * Base class constructor gets executed prior to sub class
     * @param inName
     * @param inAdddress
     */
    public StaffBase(String inName,String inAdddress)
    {
        System.out.println(" in base class sonctrucotr");
        this.mStaffName=inName;
        this.mAddress=inAdddress;
    }
    
    
    /**
     *  If Only parameterized constructor exists then a call to default constructor creates an error
     */
    public StaffBase()
    {
        
    }
    
    public void finalize()
    {
        System.out.println(" executing finalize in StaffBase");
    }
    
    public void displayInfo()
    {
        System.out.println(" Your name is ===> "+mStaffName+" with address ====> "+mAddress);
    }    
}
