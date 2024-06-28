/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gradings;

/**
 *
 * @author Sithumini
 */
public class GradingsBean {
    //creating instance variable
    private int gradingID;
    private String studentID;
    private String studentName;
    private String batch;
    private String class1;
    private String subject;
    private String grade;
    
    
    //constructor
    public GradingsBean(int gradingID, String studentID, String studentName, String batch, String class1, String subject, String grade) {
        this.gradingID = gradingID;
        this.studentID = studentID;
        this.studentName = studentName;
        this.batch = batch;
        this.class1 = class1;
        this.subject = subject;
        this.grade = grade;
    }
    
    
    //setters and getters methods
    public int getGradingID() {
        return gradingID;
    }

    
    public void setGradingID(int gradingID) {
        this.gradingID = gradingID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
     
     
    
}
