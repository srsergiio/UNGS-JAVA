package Henry_JS_en_JAVA;

public class test {
	static boolean encontrarLaPalabra(String cadena) {
		  // Escribir una funcion que reciba un string (string) y retorne true si encuentra la palabra "henry" adentro.
		  // si no, retorna false.
		  // Ej:
		  // encontrarLaBomba('bienvenidos a henry') => true;
		  // encontrarLaBomba('hola que tal, como va?!') => false;

		  // Tu c�digo:
		//indexOF
		
		//ushif
		//for maps
		for (int i =0 ;i<cadena.length();i++){
			System.out.println(cadena.charAt(i));
			if((i+4) < cadena.length()) {if(cadena.charAt(i)=='h'&&cadena.charAt(i+1)=='e'&&cadena.charAt(i+2)=='n'&&cadena.charAt(i+3)=='r'&&cadena.charAt(i+4)=='y'){return true;}}
		}
		return false;
}
	
	public static void main(String[] args) {
		System.out.println(encontrarLaPalabra("bienvenidos2 a heenry"));


	}
}