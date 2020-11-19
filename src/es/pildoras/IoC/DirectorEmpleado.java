package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	//Creacion de campo del tipo CreacionInforme(Interfaz)
	private CreacionInforme informeNuevo;
	
	//Creacion de construcctor que inyecta la dependencia
	public DirectorEmpleado(CreacionInforme creacionInforme) {
		this.informeNuevo = creacionInforme;
	}
	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}

}
