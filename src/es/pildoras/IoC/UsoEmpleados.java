package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		///Pasos a seguir para usar el contenedor Spring
		//1)Crear un contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//2)Pedirle al archivo xml el Bean, el objeto
		DirectorEmpleado juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);
		
		//3)Utilizar el Bean
		System.out.println(juan.getTareas());
		
		System.out.println(juan.getInforme());
		
		System.out.println(juan.getEmail());
		
		System.out.println(juan.getNombreEmpresa());
		
		//4)Cerrar el xml
		contexto.close();
	}
	
}

