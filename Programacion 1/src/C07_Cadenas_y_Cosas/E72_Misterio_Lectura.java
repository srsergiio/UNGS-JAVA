package C07_Cadenas_y_Cosas;

public class E72_Misterio_Lectura {


		public static String bing (String s) {
			int i = s.length() - 1;//4
			String total = "";
			while (i >= 0 ) {
					char ch = s.charAt (i);
					System.out.println (i + " " + ch); 
					//4  N
					//3  E
					//2  L
					//1  L
					//0  A
					total = total + ch;
					//NELLA
					i--;
			}
			return total;
		}
		
		
		
		
		public static void main (String[] args) {
			System.out.println (bing ("Allen"));// da vuelta la palabra y la imprime en orden
		}


	
	
}
