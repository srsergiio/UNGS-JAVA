package C10_Arreglos;

public class E108_lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bruno = hacer (5);
		dub (bruno);
		System.out.println (mus (bruno));  
		//a. ¿Cuál es la salida del siguiente programa?
		//b. Dibujá un diagrama de pila que muestre el estado del programa justo antes
		//de la sentencia return de mus.
		//c. Describí en pocas palabras lo que hace mus.
	}
			
			public static int[] hacer (int n) {// crea un arr de 5 elementos del 1 al 5
				int[] a = new int[n];
				for (int i=0; i<n; i++) {
					a[i] = i+1;
				}
				return a;
				}
			
			public static void dub (int[] jub) {//multiplca todos los elementos x2 {2,4,6,8,10
				for (int i=0; i<jub.length; i++) {
					jub[i] *= 2;
				}
				
			}
			
			
			public static int mus (int[] zoo) {// suma todos los elementos del arr
				int fus = 0;
				for (int i=0; i<zoo.length; i++) {
					fus = fus + zoo[i];
				}
					return fus;
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}

