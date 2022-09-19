package C04_Condicionales_Recursion;

public class E43_Recursion_99botellas {
	
static void imprime(String s) {
	System.out.println(s);
}
static void Verso(int n) {
	if (n>0) {
		
		imprime("Hay "+n+" botellas de cerveza en la pared, hay "+n+" botellas de cerveza,\r\n"
				+ "una sola agarr�s, y despu�s la pas�s, hay "+(n-1)+" botellas de cerveza en la\r\n"
				+ "pared.");
		n--;
		Verso(n);
	}else {
		imprime("No hay m�s botellas de cerveza en la pared, no hay m�s botellas de\r\n"
				+ "cerveza, no las agarrar�s, y no las pasar�s, porque no hay m�s botellas de cerveza en la pared.");
	}
}
	
	
	
	public static void main(String[] args) {
		Verso(99);
	}

}
