package com.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Map;

public class Courses implements InitializingBean, DisposableBean {

    private Map<Integer,String> courseName;
    private int creditHours;

    public Courses() {
        super();
    }
    public Courses(Map<Integer, String> courseName, int creditHours) {
        this.courseName = courseName;
        this.creditHours = creditHours;
    }
    public Map<Integer, String> getCourseName() {
        return courseName;
    }

    public void setCourseName(Map<Integer, String> courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    @Override
    public String toString() {
        return "Courses{" +
                "courseName=" + courseName +
                ", creditHours=" + creditHours +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        //will work as init-method
        System.out.println("init-method of course class");
    }

    @Override
    public void destroy() throws Exception {
        //will work as destroy-method
        System.out.println("destroy-method of course class");
    }
}
