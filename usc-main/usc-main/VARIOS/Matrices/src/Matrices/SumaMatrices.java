package Matrices;

import java.security.Timestamp;
import java.time.Instant;

public class SumaMatrices {
	
	
	   public  void sumarMatrices(int[][] matriz1, int[][] matriz2) {
	        // Primero hacer la suma
	        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
	        
	        for (int y = 0; y < matriz1.length; y++) {
	        	
	        	
	            for (int x = 0; x < matriz1[y].length; x++) {
	                int numeroMatriz1 = matriz1[y][x];
	                int numeroMatriz2 = matriz2[y][x];
	                int suma = numeroMatriz1 + numeroMatriz2;
	                matrizSuma[y][x] = suma;
	            }
	        }
	        // Después imprimir los encabezados
	        System.out.println("\t\t\t1\t\t\t\t\t2\t\t\t\tSuma");
	        for (int x = 0; x < 62; x++) {
	            System.out.print("_");
	        }
	        System.out.println();
	        // Finalmente imprimir los resultados
	        for (int y = 0; y < matriz1.length; y++) {
	            for (int x = 0; x < matriz1[y].length; x++) {
	                System.out.printf("%5d ", matriz1[y][x]);
	            }
	            System.out.print(" | ");

	            for (int x = 0; x < matriz2[y].length; x++) {
	                System.out.printf("%5d ", matriz2[y][x]);
	            }
	            System.out.print(" | ");

	            for (int x = 0; x < matrizSuma[y].length; x++) {
	                System.out.printf("%5d ", matrizSuma[y][x]);
	            }
	            System.out.print(" | ");
	            System.out.println();
	        }
	    }
	   
	   public  void recursivoSuma(int[][] matriz1, int[][] matriz2) {
	        // Primero hacer la suma
	        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
	        
	       
	        System.out.println("antes :" + System.currentTimeMillis());
	        System.currentTimeMillis();
	        for (int y = 0; y < matriz1.length; y++) {
	        	
	        	
	            for (int x = 0; x < matriz1[y].length; x++) {
	                int numeroMatriz1 = matriz1[y][x];
	                int numeroMatriz2 = matriz2[y][x];
	                
	                matrizSuma[y][x] = recurs(numeroMatriz1,numeroMatriz2 );
	            }
	        }
	        System.out.println("despues :" + System.currentTimeMillis());
	        // Después imprimir los encabezados
	        System.out.println("\t\t\t1\t\t\t\t\t2\t\t\t\tSuma");
	        for (int x = 0; x < 62; x++) {
	            System.out.print("_");
	        }
	        System.out.println();
	        // Finalmente imprimir los resultados
	        for (int y = 0; y < matriz1.length; y++) {
	            for (int x = 0; x < matriz1[y].length; x++) {
	                System.out.printf("%5d ", matriz1[y][x]);
	            }
	            System.out.print(" | ");

	            for (int x = 0; x < matriz2[y].length; x++) {
	                System.out.printf("%5d ", matriz2[y][x]);
	            }
	            System.out.print(" | ");

	            for (int x = 0; x < matrizSuma[y].length; x++) {
	                System.out.printf("%5d ", matrizSuma[y][x]);
	            }
	            System.out.print(" | ");
	            System.out.println();
	        }
	    }

public int recurs(int numeroMatriz1, int numeroMatriz2) {
	 int suma = numeroMatriz1 + numeroMatriz2;
    return suma;
}

}
