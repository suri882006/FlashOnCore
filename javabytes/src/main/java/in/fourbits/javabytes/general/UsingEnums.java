/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.general;

/**
 *
 * @author Suraj
 */
public class UsingEnums {
    
    enum Company {google,facebook};     // Preferred
    
    enum Planet {        
        Mercury (1,2),
        Venus(3,4);
        private int miMass;
        private int miRadius;
        Planet(int iniMass,int iniRadius)
        {
            this.miMass=iniMass;
            this.miRadius=iniRadius;
        }
    }
    
    /**
     * This method has same as that of class but its not constructor as this method has a return type
     * @return
     */
    public int UsingEnums()
    {
        System.out.println("constructor");
        return 0;
    }
    
    /**
     * This method shows the usage of enums
     * @param args
     * Enables us to use the values of a variable as constants
     * Its generally preferred that enum types be a class variable instead of local
     * You can also use it like a class with parameterized constructor and member variables
     * values() method lists all the constants in the enum variable
     */
    public static void main(String[] args) {
//        enum Company {google,facebook};   // Not preferred
        UsingEnums Obj=new UsingEnums();
        System.out.println("after ===> "+Company.facebook);
        System.out.println(" planet mass===> "+Planet.Venus.miMass);        
    }           
}
