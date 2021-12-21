package C05_MetodosConResultados;

public class E53_LecturaCodigo {
	public static void main (String[] args) {
		boolean bandera1 = esRaro (202);/*TRUE*/
		boolean bandera2 = esBorroso (202);/*TRUE*/
		System.out.println (bandera1); /*print true*/
		System.out.println (bandera2);/*print true*/

		if (bandera1 && bandera2) {
			System.out.println ("ping!"); /*imprime */
		}
		
		if (bandera1 || bandera2) {
			System.out.println ("pong!");/*imprime siempre*/
		}
		
		/* true*/
		/* true*/
		/* ping
		 * pong
		 */
		
	}
	
	
	
	
	public static boolean esRaro (int x) {
		boolean banderaRaro;
		if (x%2 == 0) {/*202=true*/
			banderaRaro = true;/*termina*/
		}else{
			banderaRaro = false;
		}
		return banderaRaro;//termina
	}
	public static boolean esBorroso (int x) {
		boolean banderaBorroso;
		if (x > 0) {
			banderaBorroso = true;
		} else {
			banderaBorroso = false;
		}
		return banderaBorroso;


	}
}
