package C08_Objetos_Interesantes;

import java.awt.Point;
import java.awt.Rectangle;

public class E83_Lectura_grow {

	public static void main (String[] args) {
		Rectangle caja1 = new Rectangle (2, 4, 7, 9);
		Point p1 = buscarCentro (caja1);//5,5 y 8,5 
		imprimirPunto (p1);
		caja1.grow (1, 1);
		Point p2 = buscarCentro (caja1);
		imprimirPunto (p2);
		}
	/*
			a. ¿Cuál es la salida del siguiente programa?
			
			-centro de los 2 rectangulo que estan ubicados en el mismo centro
			
			b. Dibujá un diagrama de estado que muestre el estado del programa justo
			antes de que termine main. Incluí todas las variables locales y los objetos
			que referencian.
			
			
			c. Al final de main, p1 y p2 ¿hacen aliasing? ¿Por qué sí o por qué no?
					*/
					
			public static void imprimirPunto (Point p) {
				System.out.println ("(" + p.x + ", " + p.y + ")");
			}
			public static Point buscarCentro (Rectangle caja) {
				int x = caja.x + caja.width/2;
				int y = caja.y + caja.height/2;
				return new Point (x, y);
			}
			

}
