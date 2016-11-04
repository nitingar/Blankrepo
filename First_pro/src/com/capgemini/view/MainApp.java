package com.capgemini.view;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.capgemini.modle.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
Employee emp =(Employee)applicationContext.getBean("employee");
Employee emp1 =(Employee)applicationContext.getBean("employee");
System.out.println(emp.getEmployeeNumber());*/
/*emp.setEmployeeNumber(7);
System.out.println(emp.getEmployeeNumber());
Employee emp1 =(Employee)applicationContext.getBean("employee");*/
/*System.out.println(emp1.getEmployeeNumber());*/

		
		ClassPathResource resource = new ClassPathResource("ApplicationContext.xml"); 
					BeanFactory factory = new XmlBeanFactory(resource); 
		 				 
		 				System.out.println("Is Employee obj created ? "); 
		 				 
		 				System.out.println("Getting employee constructor message after this"); 
		 				 
		 				Employee employee = (Employee)factory.getBean("employee"); 
		 				 
		 				System.out.println(employee.getEmployeeNumber()); 
		 				System.out.println(employee.getName()); 

		
		
	}

}
