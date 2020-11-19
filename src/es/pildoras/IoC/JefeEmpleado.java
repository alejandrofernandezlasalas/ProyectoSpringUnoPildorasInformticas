package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{

	//Creacion de campo del tipo CreacionInforme(Interfaz)
	private CreacionInforme informeNuevo;
	
	
	
	public JefeEmpleado(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestion de las cuestiones relativas a los empleados";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el jefote con complicaciones: " + informeNuevo.getInforme();
	}
}
