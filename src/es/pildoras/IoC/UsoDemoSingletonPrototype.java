package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		//1)Crear un contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//peticion de beans al contendor Spring
		SecretarioEmpleado julia = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado perla = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		/*Como Spring trabaja por defecto con el patron Singleton, 
		  significa que los dos Beans que pedimos apuntan al mismo objeto*/
		
		System.out.println(julia);
		System.out.println(perla);
		if(julia == perla)
			System.out.println("Se trata del mismo objeto");
		else
			System.out.println("Se tratan de objetos diferentes");
	}

}
