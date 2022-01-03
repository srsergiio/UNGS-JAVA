package C05_MetodosConResultados;

public class E58_Recur_invertirCadena {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirCadena("Escapar de Latino america");
		invertirCadena("Escapar de Latino america");
	}
	private static void invertirCadena(String string) {
		// TODO Auto-generated method stub
		String inverso="";
		if(largo(string)==1) {
			primero(string); 
			inverso+=primero(string); /*entro y vuelvo a los checkpoint*/
		}else {
			invertirCadena(resto(string));
			inverso+=primero(string);/*checkpoint*/
			
		}
		imprimirInverso(inverso);
	}
	
	
	public static void imprimirInverso(String string) {
		// TODO Auto-generated method stub
		System.out.print(string);
	}
	
	
	
	
	
	private static void imprimirCadena(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
		
	}
	
	public static char primero (String s) {// primero: devuelve el primer carácter de la cadena dada
		return s.charAt (0);
	}
	
	
	public static String resto (String s) {// último: devuelve una nueva cadena que contiene todas// las letras de la cadena dada, salvo la primera
		return s.substring (1, s.length());
	}
	
	public static int largo (String s) {// largo: devuelve el largo de la cadena dada
		return s.length();
	}

}
