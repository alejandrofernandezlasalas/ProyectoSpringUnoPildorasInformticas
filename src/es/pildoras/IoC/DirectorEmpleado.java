package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	//Creacion de campo del tipo CreacionInforme(Interfaz)
	private CreacionInforme informeNuevo;
	
	//Creacion de construcctor que inyecta la dependencia(Constructor)
	public DirectorEmpleado(CreacionInforme creacionInforme) {
		this.informeNuevo = creacionInforme;
	}
	
	
	private String email;
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
