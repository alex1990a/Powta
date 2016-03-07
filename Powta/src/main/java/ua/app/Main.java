package ua.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.entity.Admin;
import ua.repository.AdminRepository;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext contex = new ClassPathXmlApplicationContext("applicationContex.xml");
		AdminRepository ad= (AdminRepository) contex
				.getBean ("adminRepository");
		
		
	}

}
