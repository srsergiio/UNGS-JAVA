package C07_Cadenas_y_Cosas;
import java.text.Normalizer;

import Libro.*;
public class E76_abecedaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print.print(esAbecedaria("ágil"));
	}
	public static boolean esAbecedaria(String s) {
		s=cleanString(s);
		boolean esAbecedaria=false;
		int index=1;
		int charAT=s.charAt(0);
		while(index<s.length()) {
			if(charAT<s.charAt(index)) {
				esAbecedaria=true;
				charAT=s.charAt(index);
			}else {
				esAbecedaria=false;
				break;
			}
			index++;
		}
		
		return esAbecedaria;
		
	}
	
	
	 public static String cleanString(String texto) {
	        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
	        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	        return texto;
	    }
}
