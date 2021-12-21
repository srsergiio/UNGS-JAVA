package C04_Condicionales_Recursion;

public class E43_Recursion_99botellas {
	
static void imprime(String s) {
	System.out.println(s);
}
static void Verso(int n) {
	if (n>0) {
		
		imprime("Hay "+n+" botellas de cerveza en la pared, hay "+n+" botellas de cerveza,\r\n"
				+ "una sola agarrás, y después la pasás, hay "+(n-1)+" botellas de cerveza en la\r\n"
				+ "pared.");
		n--;
		Verso(n);
	}else {
		imprime("No hay más botellas de cerveza en la pared, no hay más botellas de\r\n"
				+ "cerveza, no las agarrarás, y no las pasarás, porque no hay más botellas de cerveza en la pared.");
	}
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verso(99);
	}

}
