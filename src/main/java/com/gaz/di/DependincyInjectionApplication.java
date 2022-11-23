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
		
		/* INYECCION POR CONSTRUCTOR:
		/*  INYECCION POR CONSTRUCTOR
		 *   LA MEJOR PRATICA:
		 * - SETTER 
		 * - CONSTRUCTOR  POR QUE SON MAS
		 *   FACILES DE PROBAR QUE LA INYECCION POR
		 *   ATRIBUTOS*/*/
	

		
	}

}
