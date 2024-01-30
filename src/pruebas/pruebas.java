package pruebas;

public class pruebas {
	public static void main(String[] args) {
		empleado trabajador1 = new empleado("Manu");
		empleado trabajador2 = new empleado("Maria");

		trabajador1.cambiaSeccion("Recursos Humanos"); 
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());

	

	}

}

class empleado {
	private final String nombre;
	private String seccion;

	public empleado(String nom) {
		nombre = nom;
		seccion = "administracion";
	}

	public String getNombre() {
		return nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la seccion es " + seccion;
	}

}
