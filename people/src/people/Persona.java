package people;

public class Persona {
	//ATRIBUTOS
	String dni;
	String nombre;
	int edad;
	
	public Persona() {
		
	}
	
	
	
	public Persona(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona (Persona otraPersona) {
		this.dni = otraPersona.dni;
		this.nombre = otraPersona.nombre;
		this.edad = otraPersona.edad;
	}



	//GETTERS & SETTERS
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//Metodo compara DNI
	public boolean mismoDni(Persona otraPersona) {
		boolean iguales = false;
		if(this.dni.equals(otraPersona.dni)) {
			iguales = true;
			
		
	}
		return iguales;
	}
	//ToString
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
}
