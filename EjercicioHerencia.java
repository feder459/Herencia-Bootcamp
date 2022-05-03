public class EjercicioHerencia {
	public static void main(String[] args) {
		Cliente persona = new Cliente();
		persona.setNombre("Federico");
		String nombre = persona.getNombre();
		persona.setEdad(28);
		int edad = persona.getEdad();
		persona.setTelefono(3884041285L);
		long telefono = persona.getTelefono();
		persona.setCredito(true);
		boolean credito = persona.getCredito();
		System.out.println("Nombre: "+nombre+" Edad: "+edad+" Telefono: "+telefono+" Credito: "+credito);

		Trabajador persona1 = new Trabajador();
		persona1.setNombre("Federico");
		String nombre1 = persona1.getNombre();
		persona1.setEdad(28);
		int edad1 = persona1.getEdad();
		persona1.setTelefono(3884041285L);
		long telefono1 = persona1.getTelefono();
		persona1.setSalario(1000);
		int salario1=persona1.getSalario();
		System.out.println("Nombre: "+nombre1+" Edad: "+edad1+" Telefono: "+telefono1+" Salario: "+salario1+" USD");


	}
}

class Persona {
	private String nombre;
	private int edad;
	private long telefono;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public long getTelefono() {
		return this.telefono;
}

}
//Cliente hereda de Persona
class Cliente extends Persona {
	private boolean credito;

	public void setCredito(Boolean credito) {
		this.credito = credito;
	}
	public Boolean getCredito() {
		return this.credito;
}
}
class Trabajador extends Persona {
	private int salario;

	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getSalario() {
		return this.salario;
	}
}

/*
public class OtroMetodo {
	public static void main(String[] args) {
		Trabajador persona = new Trabajador();
		persona.setNombre("Federico");
		String nombre = persona.getNombre();
		persona.setEdad(28);
		int edad = persona.getEdad();
		persona.setTelefono(3884041285L);
		long telefono = persona.getTelefono();
		persona.setCredito(true);
		boolean credito = persona.getCredito();
		persona.setSalario(1000);
		int salario=persona.getSalario();
		System.out.println("Nombre: "+nombre+" Edad: "+edad+" Telefono: "+telefono+" Salario: "+salario+" USD"+" Credito: "+credito);
	}
}

class Persona {
	private String nombre;
	private int edad;
	private long telefono;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public long getTelefono() {
		return this.telefono;
}

}
//Cliente hereda de Persona
class Cliente extends Persona {
	private boolean credito;

	public void setCredito(Boolean credito) {
		this.credito = credito;
	}
	public Boolean getCredito() {
		return this.credito;
}
}
class Trabajador extends Cliente {
	private int salario;

	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getSalario() {
		return this.salario;
	}
}
*/