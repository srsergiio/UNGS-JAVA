package C04_Condicionales_Recursion;

public class E44_narf {
	/*EJERCICIO de lectura*/
	
public static void sup (String pepe, int bruno) {
	System.out.println (pepe);
	if (bruno == 5)ping ("no ");
	else System.out.println ("!");
	/*1-solo por
	 *2-ping: "cualquiera no mas "
	 *3-
	 *4- 
	 * */
}


public static void clink (int tenedor) {
		System.out.print ("Est� el ");
		sup("desayuno ", tenedor/*4*/) ;
}

public static void ping (String cuerda) {
	System.out.println ("cualquiera " + cuerda + "mas ");
}

	

	public static void main(String[] args) {
		
			int bis = 5;
			int bas = 2;
			sup("solo por", bis/*5*/);
			clink (2*bas/*4*/);
			
			
			/*1-solo por
			 *2-ping: "cualquiera no mas "
			 *3-clink: esta el desayuno
			 *4-!
			 *
			 * 
			 * */
	}

}
