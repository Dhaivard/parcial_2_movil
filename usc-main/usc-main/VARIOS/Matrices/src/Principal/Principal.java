package Principal;

import java.util.Scanner;

import AlgoritmoDeOrdenamiento.AlgoritmoBurbuja;
import Matrices.MultiplicarMatrices;
import Matrices.SumaMatrices;
import Recursividad.FactorialIteractivo;
import Recursividad.FactorialRecursivo;
import Recursividad.Recursiva;
import Recursividad.Recursivo;
import programacionDinamica.Dinamica;

public class Principal {
	
	

	static int[][] matriz1 = {
            {10, 5, 12},
            {98, 5, 6},
            {8, 4, 6},
    };
    static int[][] matriz2 = {
            {8, 7, 5},
            {19, 56, 4},
            {8, 76, 90},
    };
    
    static Recursiva re = new Recursiva();
    static SumaMatrices su = new SumaMatrices();
    
    static Dinamica din = new Dinamica();
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingre el numero al cual le quier4 conocer la serie de fibonacci");
		int numero = sc.nextInt();
		//multiplicarMatrices();
		//burbuja();
		//recursivo();
		
		//recursivoSuma();
        //su.recursivoSuma(matriz1,matriz2);
		 //su.sumarMatrices(matriz1,matriz2);
		System.out.println("antes");
		System.out.println(System.currentTimeMillis()); 
		//System.out.println(); din.fibonacciRecursivo(numero);
		System.out.println(din.fibonaccilineal(numero)); 
		System.out.println("despues");
		System.out.println(System.currentTimeMillis()); 
       
	}
/*	public static void sumaMatrices() {
	
		 SumaMatrices.sumarMatrices(matriz1, matriz2);
	}
	public static void multiplicarMatrices() {
		MultiplicarMatrices.multiplicarMatrices(matriz1, matriz2);
	}
	@SuppressWarnings("static-access")
	public static void burbuja() {
		
		AlgoritmoBurbuja burbujaShirt = new AlgoritmoBurbuja();
			int[] array = { 10, 1, 5, 40, 12, 34, 44, 12, 11, 9 };
			burbujaShirt.printArray(array);
			burbujaShirt.sortArray(array);
			burbujaShirt.printArray(array);
		}
	
	public static void recursivo() {
		 re.recursivo();
	}
	
	
*/
	    public static void recursivoSuma() {
	         Recursivo mt = new Recursivo(); 
	         int [][] matriz2 = {{3,4},{3,5}};
	         System.out.println("" + mt.matrizrecursivo(matriz2));
	         
	    }
	

}
