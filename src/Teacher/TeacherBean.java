/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teacher;

/**
 *
 * @author Sithumini
 */
public class TeacherBean {
    //creating instance variable
    private int tID;
    private String teacherID;
    private String teacherName;
    private String email;
    private String contact;
    private String address1;
    private String specialization;
    
    
    //constructor
    public TeacherBean(int tID, String teacherID, String teacherName, String email, String contact, String address1, String specialization) {
        this.tID = tID;
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.email = email;
        this.contact = contact;
        this.address1 = address1;
        this.specialization = specialization;
    }
    
    
    //setters and getters methods
    public int gettID() {
        return tID;
    }

    public void settID(int tID) {
        this.tID = tID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    
}
