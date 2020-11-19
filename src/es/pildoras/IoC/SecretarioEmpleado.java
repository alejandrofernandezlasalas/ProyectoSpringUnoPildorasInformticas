package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	//Creacion de campo del tipo CreacionInforme(Interfaz)
	private CreacionInforme informeNuevo;
	
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

	//Creacion de setter que inyeccta la dependencia(setter)
	public void setInformeNuevo(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		
		return "Getionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return "Informe generado por el secretario: " + informeNuevo.getInforme();
	}

}
