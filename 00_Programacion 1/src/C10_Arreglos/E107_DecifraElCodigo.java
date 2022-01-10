package C10_Arreglos;

public class E107_DecifraElCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	public static int banana (int[] a) {// suma todos los elementos
		int uva = 0;
		int i = 0;
		while (i < a.length) {
			uva = uva + a[i];
			i++;
			}
		return uva;
		}
	
		public static int manzana (int[] a, int p) { // cuanta las veces que un elemento aparece en el Arr
			int i = 0;
			int pera = 0;
			while (i < a.length) {
				if (a[i] == p) pera++;
				i++;
			}
			return pera;
		}
		
		
		
		public static int pomelo (int[] a, int p) {//busca la primera aparicion de un elemento p en el arr
			for (int i = 0; i<a.length; i++) {
				if (a[i] == p) return i;
			}
			return -1;
		}

	
	
	
	
	
}
