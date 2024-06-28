/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Attendance;

/**
 *
 * @author Sithumini
 */
public class AttendanceBean {
    //creating instance variable
    private int atID;
    private String studentID1;
    private String class3;
    private String year;
    private String month;
    private String day;
    
    
    //constructor
    public AttendanceBean(int atID, String studentID1, String class3, String year, String month, String day) {
        this.atID = atID;
        this.studentID1 = studentID1;
        this.class3 = class3;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    
    //setters and getters methods
    public int getAtID() {
        return atID;
    }

    public void setAtID(int atID) {
        this.atID = atID;
    }

    public String getStudentID1() {
        return studentID1;
    }

    public void setStudentID1(String studentID1) {
        this.studentID1 = studentID1;
    }

    public String getClass3() {
        return class3;
    }

    public void setClass3(String class3) {
        this.class3 = class3;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    
    
    
}
