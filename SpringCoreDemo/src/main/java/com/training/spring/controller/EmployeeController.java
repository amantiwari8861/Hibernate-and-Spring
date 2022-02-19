package com.training.spring.controller;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.entity.Employee;
public class EmployeeController 
{
	public static void main(String[] args) 
	{
		
//		  Resource resource=new ClassPathResource("beans.xml"); 
//		  BeanFactory beanf=new XmlBeanFactory(resource); 
//		  //get the object from the beanfactory
//		  Employee bean = (Employee)beanf.getBean("employee"); bean.setName("Aman");
//		  System.out.println(bean.getName());
		 
//		ApplicationContext application=new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp =(Employee) application.getBean("employee");
//		emp.setEmail("aman88@gmail.com");
//		System.out.println(emp.getEmail());
//		System.out.println(emp);
		
		ApplicationContext application=new ClassPathXmlApplicationContext("constructor.xml");
		Employee emp =(Employee) application.getBean("employee");
		emp.getAddress().setPincode(110096);
		System.out.println(emp);

		
		((ConfigurableApplicationContext)application).close();
	}
}
