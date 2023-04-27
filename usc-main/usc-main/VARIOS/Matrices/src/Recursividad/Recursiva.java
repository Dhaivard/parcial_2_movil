package Recursividad;

public class Recursiva {

	public void recursivo () {
        FactorialRecursivo f= new FactorialRecursivo();
        FactorialIteractivo fi = new FactorialIteractivo();
		
        
        System.out.println("Factorial utilizando un método recursivo:");
        System.out.println("El factorial de 3 es: "+f.devuelveFactorialRecursiva(3));
        System.out.println("El factorial de 6 es: "+f.devuelveFactorialRecursiva(6));
        System.out.println();
        System.out.println("Factorial utilizando un método iterativo:");
        System.out.println("El factorial de 3 es: "+fi.devuelveIterativo(3));
        System.out.println("El factorial de 6 es: "+fi.devuelveIterativo(6));
        System.out.println();
    }
}
