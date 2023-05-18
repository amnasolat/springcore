package com.springcore;



import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private int employeeId;
    private String employeeName;
    private List<String> employeeAddress; //allow duplication
    private Set<String> employeeNumber;   //doesn't allow duplication
    private Map<Integer,String> employeePosition; // key value pairs where name and value can be any type
    private Properties employeeRank; //key value pairs where name and value only string type
    public Employee() {
        super();
    }

    public Employee(int employeeId, String employeeName, List<String> employeeAddress, Set<String> employeeNumber, Map<Integer, String> employeePosition, Properties employeeRank) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeNumber = employeeNumber;
        this.employeePosition = employeePosition;
        this.employeeRank = employeeRank;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        System.out.println("setting employeeId");
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(List<String> employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Set<String> getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Set<String> employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Map<Integer, String> getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(Map<Integer, String> employeePosition) {
        this.employeePosition = employeePosition;
    }

    public Properties getEmployeeRank() {
        return employeeRank;
    }

    public void setEmployeeRank(Properties employeeRank) {
        this.employeeRank = employeeRank;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress=" + employeeAddress +
                ", employeeNumber=" + employeeNumber +
                ", employeePosition=" + employeePosition +
                ", employeeRank=" + employeeRank +
                '}';
    }
    public void init(){
        System.out.println("inside init method");
    }
    public void destroy(){
        System.out.println("inside destroy method");
    }






}
