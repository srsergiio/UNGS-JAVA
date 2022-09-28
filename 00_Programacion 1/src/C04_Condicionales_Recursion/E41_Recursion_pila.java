package C04_Condicionales_Recursion;

public class E41_Recursion_pila {
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static void nLineas (int n) {
		if (n > 0) {
		System.out.println ("");
		nLineas (n-1);
		}
	}
	
	/*PILA 
	 * MAIN
	 * nLineas (4)
	 * salto de linea 
	 * nLineas (3)
	 * salto de linea 
	 * nLineas (2)
	 * salto de linea 
	 * nLineas (1)
	 * salto de linea 
	 * nLineas (0)
	 * 
	 * */
	
	public static void main(String[] args) {

	}

}
