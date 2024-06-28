/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author Sithumini
 */
public class StudentBean {
    //creating instance variable
    private int sID;
    private String firstName;
    private String lastName;
    private String stuID;
    private String gender;
    private String city;
    private String contactNo;
    private String address;
    private String class2;
    
    
    //constructor
    public StudentBean(int sID, String firstName, String lastName, String stuID, String gender, String city, String contactNo, String address, String class2) {
        this.sID = sID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.stuID = stuID;
        this.gender = gender;
        this.city = city;
        this.contactNo = contactNo;
        this.address = address;
        this.class2 = class2;
    }
    
    
    //setters and getters methods
    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2;
    }
    
}
