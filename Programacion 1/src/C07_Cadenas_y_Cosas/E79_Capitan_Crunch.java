package C07_Cadenas_y_Cosas;
import Libro.*;
public class E79_Capitan_Crunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print.print(decodificar('a'));
	}
	
	public static String decodificar(char l) {
		l=  (char) (l+13);
		String letra=Character.toString(l);	
		return letra;
		
	}

}
