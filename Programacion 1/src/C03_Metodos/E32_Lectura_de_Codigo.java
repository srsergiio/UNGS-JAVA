package C03_Metodos;

public class E32_Lectura_de_Codigo {
	/*a. �Cu�l es la salida del siguiente programa? S� preciso acerca de d�nde hay
			espacios y d�nde hay nuevas l�neas.
			AYUDA: Empez� por describir en palabras que hacen ping y baffle cuando
			son llamados.
			b. Dibujar un diagrama de la pila que muestre el estado del programa la primera vez que ping es llamado.*/
			
	public static void zoop () {
		baffle (); //pac.
		System.out.print ("Vos zacata ");
		baffle ();
		//String+pac.
		//Vos zacata pac.
		//
		}
	public static void baffle () {
		System.out.print ("pac");
		ping ();
		}
	public static void ping () {
		System.out.println (".");
		}
			public static void main (String[] args) {
			System.out.print ("No, yo ");  //No, yo 
			zoop ();
			//No, yo g+pac.
			//Vos zacata pac.
			//
			System.out.print ("Yo ");
			baffle ();
			//Yo pac.
			//
			}
			

			
}
