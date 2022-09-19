package C10_Arreglos;

public class E114_testearPalabra {
//	En el verdadero Scrabble, hay algunas fichas en blanco que pueden ser usadas
//	como comodines; es decir, se pueden usar para representar cualquier letra.
//	Pens� un algoritmo para testearPalabra que trabaje con comodines. No te
//	estanques con detalles de implementaci�n como ver de qu� forma representar 
//	comodines. Simplemente describ� el algoritmo, usando el castellano, pseudoc�digo,
//	o Java

public static boolean Comparar2dichas(char i ,String p){
	boolean ret = false;
	for (int l = 0; l < p.length(); l++){
		if (p.charAt(l) == i){
			ret = true;
			break;
		}
		if (' ' == i){
			ret = true;
			break;
		}
	}
	return ret ;

}

public static void testearPalabra(String ficha, String palabra) {
	int cont= 0;
	for(int i = 0; i < ficha.length(); i++) {
		if (Comparar2dichas (ficha.charAt(i),palabra)){
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
		String ficha= "   ";
		String palabra= "asd";
		testearPalabra( ficha,  palabra);
	}

}
