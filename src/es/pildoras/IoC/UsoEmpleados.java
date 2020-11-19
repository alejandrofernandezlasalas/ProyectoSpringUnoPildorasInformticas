package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		///Pasos a seguir para usar el contenedor Spring
		//1)Crear un contexto
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	
//		//2)Pedirle al archivo xml el Bean, el objeto
//		Empleados juan = contexto.getBean("miEmpleado",Empleados.class);
//		
//		//3)Utilizar el Bean
//		System.out.println(juan.getTareas());
//		
//		System.out.println(juan.getInforme());
//		

		
		//2)Pedirle al archivo xml el Bean, el objeto
		SecretarioEmpleado maite = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		//3)Usar el Bean
		System.out.println(maite.getTareas());
		
		System.out.println(maite.getInforme());
		
		//Inyectamos campos con Spring
		System.out.println("Email: "+ maite.getEmail());
		System.out.println(maite.getNombreEmpresa());
		
		//4)Cerrar el xml
		contexto.close();
	}
	
}

