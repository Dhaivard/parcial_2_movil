
public class Alumno {
	
	private String nonbre;
	private String apellido;
	private double nota;
	
	
	public String getNonbre() {
		return nonbre;
	}
	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Alumno [nonbre=" + nonbre + ", apellido=" + apellido + ", nota=" + nota + "]";
	}
	
	
	
	
	
	

}
