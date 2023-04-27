package Recursividad;

public class FactorialIteractivo {

	public int devuelveIterativo(int n) {
		  // Esto es un equivalente iterativo
	    
	        int t, resultado;
	        resultado=1;
	        for (t=1; t<=n; t++) resultado *=t;
	        return resultado;
	    }
	
}
