package carrera;

public class Corredor {
	private double edad;
	private char sexo;
	
	public Corredor(double e, char s){
		this.setEdad(e);
		this.setSexo(s);
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
