package C09_Crea_Tus_Propio_Objeto;

public class E91_Ficha {
	
	public static void main(String[] args) {
		E91_Ficha domino = new E91_Ficha('z',10);
		imprimirFicha(domino);
	}


	public char letra ;
	public int valor;
	
	public  E91_Ficha() {
		this.letra='a';
		this.valor=1;
	}
	
	public  E91_Ficha(char l,int v) {
		this.letra=l;
		this.valor=v;
	}

	
	public static void imprimirFicha(E91_Ficha clase) {
		System.out.println("Ficha :"+clase.letra+" ,Valor =>"+ clase.valor);
	}

}
