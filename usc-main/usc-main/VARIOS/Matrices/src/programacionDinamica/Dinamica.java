package programacionDinamica;

public class Dinamica {
	
	
	//metodo recursivo de la serie fibonacci de complejidad algoritmica exponencial
	public int fibonacciRecursivo(int numero) {
       
		//0 1 1 2 3 5 8 13 21 34 55 89
		if(numero <= 1) {
			//System.out.println(numero);
			return numero;
			
		}
		
		return fibonacciRecursivo(numero -1 ) + fibonacciRecursivo(numero -2);
		
	}
	
	//metodo dinamico de la serie fibonacci de complejidad algoritmica lineal
		public int fibonaccilineal(int numero) {
	       
			int [] fibonacci = new int[numero + 1];
			fibonacci [0] = 0;
			fibonacci[1] = 1;
			
			for(int i = 2 ; i <= numero ; i ++) {
				
				fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
				
			}
			return fibonacci[numero];
			
			
		}

}
