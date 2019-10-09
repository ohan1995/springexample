package com.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExampleMainClass {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-example.xml");
		WithXmlSpringExample withXmlSpringExample = (WithXmlSpringExample) context.getBean("springexample");
		withXmlSpringExample.getName();
		
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.scan("com.springexample");
		annotationConfigApplicationContext.refresh();
		WithAnnotationSpringExample withAnnotationSpringExample = annotationConfigApplicationContext
																	.getBean(WithAnnotationSpringExample.class);
		int result = withAnnotationSpringExample.sum(1, 3);
		System.out.println("Sum : " + result);
		
		context = new AnnotationConfigApplicationContext(WithConfigurationSpringExample.class);
		SpringExampleService service  = (SpringExampleService) context.getBean("springservice");
		service.getService();
	}
}
