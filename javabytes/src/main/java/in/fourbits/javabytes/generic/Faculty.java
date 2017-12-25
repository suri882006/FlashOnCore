/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.fourbits.javabytes.generic;

import java.util.Objects;

/**
 *
 * @author hp
 */
public class Faculty {

    public Faculty(int facultyId, String facultyName, String department, String pfNumber) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.department = department;
        this.pfNumber = pfNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.facultyId;
        hash = 37 * hash + Objects.hashCode(this.facultyName);
        hash = 37 * hash + Objects.hashCode(this.department);
        hash = 37 * hash + Objects.hashCode(this.pfNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Faculty other = (Faculty) obj;
        if (this.facultyId != other.facultyId) {
            return false;
        }
        if (!Objects.equals(this.facultyName, other.facultyName)) {
            return false;
        }
        if (!Objects.equals(this.department, other.department)) {
            return false;
        }
        if (!Objects.equals(this.pfNumber, other.pfNumber)) {
            return false;
        }
        return true;
    }
    
    private int facultyId;
    private String facultyName;
    private String department;
    private String pfNumber;

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPfNumber() {
        return pfNumber;
    }

    public void setPfNumber(String pfNumber) {
        this.pfNumber = pfNumber;
    }
    
    
    
}
