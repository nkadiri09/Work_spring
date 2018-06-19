package com.naren.kadiri;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

public class DrawingApp {

	public static void main(String args[]) {

		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.drqw();
	}

}
