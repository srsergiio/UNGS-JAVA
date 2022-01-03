package C08_Objetos_Interesantes;

import java.awt.Point;
import java.awt.Rectangle;

public class E82_lectura_Distancias {
/*
 * 	a. Para el siguiente programa, dibujá un diagrama de estado mostrando el
	estado del programa justo antes de que distancia termine. Incluí todas las
	variables y parámetros y objetos a los cuales referencien esas variables.

	b. ¿Cuál es la salida de este programa?

*/
	public static double distancia (Point p1, Point p2) {
		int dx = p1.x - p2.x;
		int dy = p1.y - p2.y;
		return Math.sqrt (dx*dx + dy*dy);
		}
	
	
		public static Point buscarCentro (Rectangle caja) {
			int x = caja.x + caja.width/2;
			int y = caja.y + caja.height/2;
			return new Point (x, y);
		}
		
		
		
		public static void main (String[] args) {
			Point nada = new Point (5, 8);
			
			Rectangle rect = new Rectangle (0, 2, 4, 4);
			
			
			
			Point centro = buscarCentro(rect);
			System.out.println(centro);
			double dist = distancia (centro, nada);
			
			System.out.println (dist);
		}


}
