package agenda;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad){
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	private void setEdad(int edad) {
		this.edad = edad;
	}
	public String primeraLetra() {
		return this.getNombre().substring(0,1);
	}
	public int Compare(Persona p) {
		return this.getEdad() - p.getEdad();
	}
	
}
