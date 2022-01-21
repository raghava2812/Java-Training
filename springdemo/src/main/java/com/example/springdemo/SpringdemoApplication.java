package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		samplespring m = (samplespring) context.getBean("samplespring");
		System.out.println("===========================================================");
		System.out.println("||\t\t\t\t\t\t\t ||");
		System.out.print("|| \t");
		m.saymeow();
		m.speak();
		System.out.println("\t ||");
		System.out.println("||\t\t\t\t\t\t\t ||");
		System.out.println("===========================================================");
	}
}