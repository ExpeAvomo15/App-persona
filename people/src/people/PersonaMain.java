package people;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("1234X", "Edgar", 27);
		Persona p2 = new Persona("1254Y", "Leo", 17);
		Persona p3 = new Persona("1234Q", "Jlo", 38);
		Persona p4 = new Persona("1234Z", "Brad", 45);
		
		Persona copiaP1 = new Persona(p1);
		copiaP1.setNombre("Adrián");
		//copiaP1.setDni("12345H");
		
		Persona [] arrayPersonas = new Persona[4];
		//Añadimos las personas al array
		arrayPersonas[0]=p1;
		arrayPersonas[1]=p2;
		arrayPersonas[2]=p3;
		arrayPersonas[3]=p4;
		
		boolean find = false;
		for(int i=0; i<arrayPersonas.length; i++) {
			find=arrayPersonas[i].mismoDni(copiaP1);
			if(find==true) {
				System.out.println("Persona encontrada en la posición: "+i);
				System.out.println(arrayPersonas[i]);
				
			}
			
			else {
				System.out.println("No hay coincidencias!");
			}
		}
	}

}
