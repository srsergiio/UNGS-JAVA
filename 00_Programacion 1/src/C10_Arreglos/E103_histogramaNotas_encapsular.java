package C10_Arreglos;



public class E103_histogramaNotas_encapsular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Calificaciones= ARRNotas(20);
		imprimirNotas(Calificaciones);
		int[] NotasRepetridas=histogramaNotas(Calificaciones);
		imprimirhistograma(NotasRepetridas);
		
		
	
	}
	
	public static int[] histogramaNotas(int[] notas) {
		int[] cuentas = new int [notas.length];
		for (int i = 0; i<cuentas.length; i++) {
		cuentas[i] = enRango (notas, i);
		}
		return cuentas;
	}
	
	public static  int[] ARRNotas(int notas) {
		int [] Notas=new int[notas];
		for(int i =0;i<Notas.length;i++) {
			Notas[i]=E102_EnteroAleatorio.EnteroAleatorio(1, 10);
		}
		return Notas;
	}
	
	public static int enRango (int[] a, int bajo, int alto) {
		int contador = 0;
		for (int i=0; i<a.length; i++) {
		if (a[i] >= bajo && a[i] < alto)
		contador++;
		}
		return contador;
		}
	public static int enRango (int[] a, int nota) {
		int contador = 0;
		for (int i=0; i<a.length; i++) {
		if (a[i] == nota )
		contador++;
		}
		return contador;
		}


	public static void imprimirNotas(int [] ArrNotas) {
		for(int Calificaciones : ArrNotas) {
			System.out.print(Calificaciones+"  ");
		}System.out.println( "");

	}
	
	public static void imprimirhistograma(int [] histograma) {
		for (int i=0; i<histograma.length; i++) {
			System.out.println("Calificaciones iaguales a "+ (i) +" => "+histograma[i]);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}
