package com.springcore;
// bean is class holds the getter setter method bean is handle by IOC
public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;
    private Courses obj;
    //constructor with parameters
    public Student(int studentId, String studentName, String studentAddress, Courses obj){
        super();
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.obj=obj;
    }
   //default constructor
    public Student(){
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public Courses getObj() {
        return obj;
    }
    public void setStudentAddress(String studentAddress) {

        this.studentAddress = studentAddress;
    }
    public void setObj(Courses obj) {
        this.obj = obj;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", obj=" + obj +
                '}';
    }


}
