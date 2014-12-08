package com.anfcorp.anand.spring03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 * Lesson 10 : Bean Autowiring by name and constructor.
 */

public class App 
{
    public static void main( String[] args )
    {
    	//Old and boring way :
        //Triangle triangle = new Triangle();
        
    	/**
    	 * Two ways of using a bean : XMLBeanFactory and XMLApplicationContext
    	 * XMLBeanFactory uses FileSystemResource to read spring configuration files.
    	 * ClassPathXMLApplicationContext uses the project's class path to read configuration files. This is preferred better practice.
    	 */
        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource ("spring-context.xml"));
    	BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-context.xml");
        Triangle triangle  = (Triangle)beanFactory.getBean("triangle-alias");

        
        triangle.draw();
    }
}
