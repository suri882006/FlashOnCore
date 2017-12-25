/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.reflection;

/**
 *
 * @author Suraj
 */
public class Employee {
    
    private String name;
    private String address;
    private int employeeNo=20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployeeNo() {
        System.out.println("returning employee no "+employeeNo);
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }
    
}
