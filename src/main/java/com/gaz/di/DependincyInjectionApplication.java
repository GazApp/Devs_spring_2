package com.gaz.di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gaz.di.atributo.Coche;
import com.gaz.di.atributo.Motor;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class DependincyInjectionApplication {

	public static void main(String[] args) {
		
	
	ConfigurableApplicationContext context = SpringApplication.run(DependincyInjectionApplication.class,args);
	
	Coche coche = context.getBean(Coche.class);
	
	System.out.println(coche);
		
		/*
		 * Motor motor = new Motor("Z11", 1996);
		 * 
		 * Coche coche = new Coche("VW", 1986, motor);
		 
		System.out.println(coche);*/
		
	}

}
