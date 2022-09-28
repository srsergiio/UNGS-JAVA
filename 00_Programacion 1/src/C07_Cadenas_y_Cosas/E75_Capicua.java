package C07_Cadenas_y_Cosas;

public class E75_Capicua {

	public static void main(String[] args) {
		System.out.print(esCapicuaIter("12121"));
		System.out.print(medio("12345"));
	}
	public static String primera(String s) {
		return ""+s.charAt(0);
	}
	
	public static String ultima(String s) {
		return ""+s.charAt(s.length()-1);
	}
	
	public static String medio(String s) {
		return s.substring(1, s.length()-1);
	}
	public static boolean esCapicuaIter(String s) {
		String palabra ="";
		int index=0;
		boolean Boolean=false;
		
		while(index<s.length() ) {
			palabra+=""+s.charAt((s.length()-1)-index);
			index++;
		}Boolean =s.equals(palabra);
		return Boolean;
	}	
	
	
	//agregara mas mas metodos 


}
