/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevices;

/**
 *
 * @author acer
 */
public class SinhVien {
    private String name;
    private int age;
    private boolean gender;
    private String department;
    private String favourite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }

    public SinhVien() {
    }

    public SinhVien(String name, int age, boolean gender, String department, String favourite) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.favourite = favourite;
    }
    public Object[] toDataRow(){
        return new Object[]{name,age,gender==true? "Male" : "Female",department,favourite};
    }
}
