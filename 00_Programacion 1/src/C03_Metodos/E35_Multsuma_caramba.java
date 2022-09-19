package C03_Metodos;

public class E35_Multsuma_caramba {
	/* Seno = 			 Math.sin(argumento);
	 * coseno =			 Math.cos(argumento);
	 * Logaridmo =		 Math.log(argumento);
	 * PI =				 Math.PI;
	 * Raiz = 			 Math.sqrt (argumento)
	 * Elevar =          Math.pow(argumento 1,argumento2)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * punto flotante: Tipo de variable (o valor) que puede contener tanto fracciones como enteros. En Java este tipo se llama double.
	 *clase: Nombre para una colecci�n de m�todos. Hasta ahora, hemos usado las clases Math y System y hemos escrito clases llamadas Hola y
	 *
	 *	
	m�todo: Nombre para una secuencia de sentencias que realiza alguna
	funci�n �til. Los m�todos pueden o no tomar par�metros, y pueden
	o no producir un resultado.
	 *	
	par�metro: Pieza de informaci�n que se provee al llamar un m�todo. Lospar�metros son como las variables en el sentido de que contienen
	valores y son de alg�n tipo.
	 *	
	argumento: Valor que se provee cuando se llama a un m�todo. Este valor debe tener el mismo tipo que el par�metro correspondiente. En
	castellano, par�metro y argumento tienden a utilizarse indistintamente.
	 *
	llamar: Causar que un m�todo sea ejecutado.
	 * 
	 * 
	 * 
	 * */
	
	static void imprimir(double x) {
		System.out.println(x+"");
	}
	static void multsuma(double a,double b,double c) {
		imprimir( a*b + c);
	}
	
	static void caramba(double x) {
		imprimir( x*Math.pow(Math.E, -x)+Math.sqrt(1-Math.pow(Math.E,-x)));
	}
	public static void main(String[] args) {
		multsuma(1,2,3);
		caramba(2);
		double Funciones_math=Math.sin(Math.PI/4)+(Math.cos(Math.PI/4)/2);
		imprimir(Funciones_math);
	}

}
