package C08_Objetos_Interesantes;

import java.awt.Point;

public class E81_Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		Point nada = new Point (1, 2);
		System.out.println (pepe (x, nada));
		System.out.println (x);
		System.out.println (nada.x);
		System.out.println (nada.y);
	}
	
	
	public static int pepe (int x, Point p){
	x = x/*5*/ + 7;
	return x + p.x + p.y;
	}
	
	/*x +7 + p.x+ p.y
	 *5 +7 +1   + 2
	 * 15 
	 * imprime variables 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
}
