/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.filehandling;

import java.io.Serializable;

/**
 *
 * @author Suraj
 */
public class Employee implements Serializable{

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", employeeName=" + employeeName + ", address=" + address + ", contactNo=" + contactNo + '}';
    }

    public Employee() {
    }

    public Employee(int id, String employeeName, String address, String contactNo) {
        this.id = id;
        this.employeeName = employeeName;
        this.address = address;
        this.contactNo = contactNo;
    }
    
    private transient int id;
    private String employeeName;
    private String address;
    private String contactNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }    
}
