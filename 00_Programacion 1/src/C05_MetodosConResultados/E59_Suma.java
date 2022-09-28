package C05_MetodosConResultados;

public class E59_Suma {

	public static void main(String[] args) {
		//print(metUno(3,4));/*sumadeRango m asta n*/
		print(metDos(1,5)); /* factorialdeRango */
	}
	
	public static int metUno (int m, int n) {
		if (m == n) {
			return n;
		} else {
			return m + metUno (m+1, n);
		}
	}
	
	public static int metDos (int m, int n) {
		if (m == n) {
			return n;
		} else {
			return n * metDos (m, n-1);
		}
	}

	public static void print(Object s) {
		System.out.println(s);
	}
}
