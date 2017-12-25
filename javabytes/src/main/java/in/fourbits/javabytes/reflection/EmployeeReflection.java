/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author Suraj
 */
public class EmployeeReflection {

    public static void main(String[] args) throws Exception {
        Employee employee = new Employee();
        System.out.println("Employee methods using reflection : ");
        for (Method method : Employee.class.getMethods()) {
            System.out.println("method name -- >" + method.getName() + "generic - tostring -- " + method.toString());
            System.out.println("return type - " + method.getReturnType());
        }
        System.out.println(" fields --> " + Employee.class.getDeclaredFields().toString());
        for (Field field : Employee.class.getDeclaredFields()) {
            System.out.println("field name - >" + field.getName());
        }
//        Class empNull =  null;
//        System.out.println(" is empNull "+((empNull==null)?"true":"false"));

        //System.out.println(" is emp "+((emp==null)?"true":"false"));
        EmployeeReflection employeeReflection = new EmployeeReflection();
        employeeReflection.getInstance();
        //Method m = emp.getMethod("getEmployeeNo", null);
        //m.inv



    }

    public void getInstance() throws Exception {
        Class emp = Class.forName("in.fourbits.javabytes.reflection.Employee", false, this.getClass().getClassLoader());
        System.out.println(" is emp null : " + ((emp == null) ? "true" : "false"));
        Method method = emp.getMethod("getEmployeeNo");        
        method.invoke(emp.newInstance(), null);
        System.out.println(" is method null : " + ((method == null) ? "true" : "false"));
    }
}
