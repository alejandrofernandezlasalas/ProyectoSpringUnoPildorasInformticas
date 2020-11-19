package es.pildoras.IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		// Creacion de objetos de tipo empleados
		
		Empleados empleado1 = new DirectorEmpleado();
		
		
		//Uso de los objetos creados
		System.out.println(empleado1.getTareas());
		
		///Cada vez que quiero un objeto nuevo o presindir, tengo que modificar codigo en la aplicacion
	}
	

}
