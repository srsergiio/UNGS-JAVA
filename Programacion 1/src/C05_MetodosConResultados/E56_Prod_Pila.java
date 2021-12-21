package C05_MetodosConResultados;

public class E56_Prod_Pila {
	public static void main (String[] args) {
		System.out.println (prod (1.0, 4.0));
	}
	public static int prod (int m, int n) {
		if (m == n) {
			return n;
		} else {
			int recursion = prod (m, n-1);
			
			int resultado = n * recursion;
			return resultado;
		}
	}
	
	public static double prod (double m, double n) {
		if (m == n) {
			return n;
		} else {
			return n *  prod (m, n-1);
		}
	}

}
/*Dibujá un diagrama de pila mostrando el estado del programa justo antes
de que la última instancia de prod se complete. ¿Cuál es la salida del programa?
b. Explicá en pocas palabras qué hace prod.
c. Reescribir prod sin usar las variables temporales recursion y resultado.*/

/*MAIN 
 * 		prod (1, 4); 			=(resultado =24)
 * 	4x		prod (1, 3); 		=(resultado =6)
 * 		3x		prod (1, 2); 	=(resultado =2 )
 * 			2x		prod (1, 1);	 =(n=1)
 * 										n=1
 * 
 * 
 * 
 * proc reduce el N ingtrsadi y desoues hace un factorial asta ese numero 1x2x3x4 
 * 
 * 
 * 
 * 
 */