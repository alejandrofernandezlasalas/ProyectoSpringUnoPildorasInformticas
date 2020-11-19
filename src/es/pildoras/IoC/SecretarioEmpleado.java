package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	//Creacion de campo del tipo CreacionInforme(Interfaz)
	private CreacionInforme informeNuevo;

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
