package C10_Arreglos;

public class E101_doubleAleatorio {

	public static void main(String[] args) {
		
		int i=0;
		while(i<1000) {
		System.out.println(doubleAleatorio(0,10));	i++;}
	}
	
	public static double  doubleAleatorio(double minimo,double maximo) {
		return (Math.random()*(maximo+1)-minimo) + (minimo);
		
		//Math.random() 0.1 a 0.9
		//Math.random() * maximo (pero pq random no llega al maximo esto nunca va llegar a 10 va a llegar a 9.9)
		//round(Math.random()* maximo ) o Math.random()* maximo+1 de estas 2 formma varia entre 0 y 10
		//
		//
		
		
	}
	
	
	
	
	
	
}
