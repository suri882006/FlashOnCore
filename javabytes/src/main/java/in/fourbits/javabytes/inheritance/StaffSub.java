/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.inheritance;

/**
 *
 * @author Suraj
 */
public class StaffSub extends StaffBase {
    
    /**
     *  Default Constructor passing parameters to its base class using super keyword
     *  making this Constructor as private does not effect the functionality.
     *  call to the base class constructor using super should be the first statement in sub class constructor
     */
    private StaffSub()
    {
//        System.out.println(" in sub class construcotr");    // This is error
        super("Suraj","Korangrapady");
        System.out.println("in sub class construcotr");
    }
    
    @Override
    public void finalize()
    {
        super.finalize();
        System.out.println(" executing finalize in StaffSub");
    }
    
    /**
     * This method overrides the same method displayInfo defined in base class
     */
    @Override
    public void displayInfo()
    {
        System.out.println(" static values in StaffSub for Name ====> asd  with address ===> Udupi");
    }
    
    public static void main(String[] args) {
        System.out.println(" in main");
        StaffSub Obj=new StaffSub();
        Obj.displayInfo();  // To call the subclass displayInfo
        StaffBase Obj1=new StaffBase();
        Obj1.displayInfo(); // To call the baseclass displayInfo
        
        
    }
    
}
