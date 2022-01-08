package C09_Crea_Tus_Propio_Objeto;

public class E93_Complejo {
	double real, imag;
	// constructor sencillo
	public E93_Complejo () {
		this.real = 0.0; this.imag = 0.0;
	}
	
	// constructor que toma parámetros
	public E93_Complejo (double real, double imag) {
		this.real = real; 
		this.imag = imag;
	}
	
	
	public static void imprimirComplejo (E93_Complejo c) {
	System.out.println (c.real + " + " + c.imag + "i");
	}
	
	// conjugado es un modificador
	public static void conjugado(E93_Complejo c) {
	c.imag = -c.imag;
	}
	
	// abs es una función que devuelve un valor primitivo
	public static double abs (E93_Complejo c) {
	return Math.sqrt (c.real * c.real + c.imag * c.imag);
	}
	
	// sumar es una función que devuelve un nuevo Complejo
	public static E93_Complejo suma (E93_Complejo a, E93_Complejo b) {
	return new E93_Complejo (a.real + b.real, a.imag + b.imag);
	}
	
	
	public static void main(String args[]) {
	// usa el primer constructor
		E93_Complejo x = new E93_Complejo ();
		x.real = 1.0;
		x.imag = 2.0;
	// usa el segundo constructor
		E93_Complejo y = new E93_Complejo (3.0, 4.0);
		System.out.println (E93_Complejo.abs (y));
		
	E93_Complejo.conjugado (x);
	E93_Complejo.imprimirComplejo (x);
	E93_Complejo.imprimirComplejo (y);
	E93_Complejo s = E93_Complejo.suma (x, y);
	E93_Complejo.imprimirComplejo (s);
	}
	}
