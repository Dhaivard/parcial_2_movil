package ComplejidadAlgoritmica;

public class Complejidad {
	
	private static final long SLEEP_TIME = 5;
	public static void doNothing() { 
		try { 
			Thread.sleep(SLEEP_TIME); 
		} catch (InterruptedException e) { e.printStackTrace(); }}
	
	public void linear(int endN) {
		
		for (int i = 0; i < endN; i++) 
			doNothing();
		}
	
	public void cuadratica(int endN) { 
		for (int i = 0; i < endN; i++) 
			for (int j = 0; j < endN; j++) 
				doNothing();
		
	}public void cubica(int endN) { 
		for (int i = 0; i < endN; i++) 
			for (int j = 0; j < endN; j++)
				for (int k = 0; k < endN; k++) 
					doNothing();
		
	}public void logaritmico(int endN) {
		for (int i = 1; i <= endN; i *= 2) { 
			doNothing(); } }
	
}

