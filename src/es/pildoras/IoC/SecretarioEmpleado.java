package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		
		return "Getionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return null;
	}

}
