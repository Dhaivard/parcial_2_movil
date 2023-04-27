import java.util.Scanner;

public class Operacion {
	
	private Alumno[]  list = new  Alumno[10];
	private Alumno alumno = new Alumno();
	
	
	public void recorrerAlumno() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ingre el nombre del alumno");
		alumno.setNonbre(sc.next());
			
		System.out.print("ingre el apellido del alumno");
		alumno.setApellido(sc.next());
		
		System.out.print("ingrenota del alumno");
		alumno.setNota(sc.nextDouble());
		
		System.out.print("el alumno ingresado es : " + alumno.toString());
		
		
		
		
	}



}
