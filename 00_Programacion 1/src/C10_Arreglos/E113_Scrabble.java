package C10_Arreglos;

import C09_Crea_Tus_Propio_Objeto.E91_Ficha;

public class E113_Scrabble {

//	En el Scrabble, cada jugador tiene un conjunto de fichas con letras, y el objetivo
//	del juego es usar esas letras para formar palabras. El sistema de puntuaci�n
//	es complicado, pero como gu�a a groso modo, las palabras m�s largas frecuentemente
//	valen m�s que las cortas.
//	Imagin� que te dan un conjunto de fichas representado con un String, por
//	ejemplo "qijibo" y te dan otro String para testear, por ejemplo, "jib". Escrib� un
//	m�todo llamado testearPalabra que tome estas dos Strings y devuelva verdadero si 
//	el conjunto de fichas puede ser usado para deletrear la palabra. Pod�s tener
//	m�s de una ficha con la misma letra, pero cada ficha puede ser usada una sola vez.
//	
	
	public static boolean chartenpalabra(char i ,String p){
		boolean ret = false;
		for (int l = 0; l < p.length(); l++){
			if (p.charAt(l) == i){
				ret = true;
				break;
			}
		}
		return ret ;

	}
	
	public static void testearPalabra(String ficha, String palabra) {
		int cont= 0;
		for(int i = 0; i < ficha.length(); i++) {
			if (chartenpalabra (ficha.charAt(i),palabra)){
				cont++;
				
			}
			if (cont == palabra.length()){
				System.out.println("tengo todas las ficha mother fucker");
				return;
			}
		}
		System.out.println("shit !! me falta la motherFUCKER ficha");

	}

	public static void main(String[] args) {
		String ficha= "asd";
		String palabra= "asd";
		testearPalabra( ficha,  palabra);
	}

}
