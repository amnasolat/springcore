package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student= (Student) context.getBean("student1");
        Student stu=(Student) context.getBean("student2");
        System.out.println(student);
        System.out.println(stu);
        Employee employee= (Employee) context.getBean("employee1");
        System.out.println(employee);
        context.registerShutdownHook();
    }
}