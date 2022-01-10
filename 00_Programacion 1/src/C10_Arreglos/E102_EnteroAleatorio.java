package C10_Arreglos;

public class E102_EnteroAleatorio {

	public static int  EnteroAleatorio(int minimo,int maximo) {
		return (int) (Math.round(Math.random()*maximo-minimo)+minimo);
		
		//Math.random() 0.1 a 0.9
		//Math.random() * maximo (pero pq random no llega al maximo esto nunca va llegar a 10 va a llegar a 9.9)
		//round(Math.random()* maximo-minimo ) +minimo MIN deafuera establece el limite de que si lo de la isquierda es 0 po
		//
		//
		
		
	}
}
