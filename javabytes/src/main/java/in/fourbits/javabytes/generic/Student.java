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
public class Student {

    public Student(int studentId, String studentName, String Course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.Course = Course;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.studentId;
        hash = 89 * hash + Objects.hashCode(this.studentName);
        hash = 89 * hash + Objects.hashCode(this.Course);
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
        final Student other = (Student) obj;
        if (this.studentId != other.studentId) {
            return false;
        }
        if (!Objects.equals(this.studentName, other.studentName)) {
            return false;
        }
        if (!Objects.equals(this.Course, other.Course)) {
            return false;
        }
        return true;
    }
    
    private int studentId;
    private String studentName;
    private String Course;

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the Course
     */
    public String getCourse() {
        return Course;
    }

    /**
     * @param Course the Course to set
     */
    public void setCourse(String Course) {
        this.Course = Course;
    }
    
}
