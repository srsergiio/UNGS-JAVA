package C05_MetodosConResultados;

public class E54_Distancia {
	/*El objetivo de este ejercicio es escribir un método nuevo que use un método
existente. Tenés que escribir sólo un método: distancia. No tenés que escribir
sumCuadrados o main y no tenés que llamar a distancia*/
	
	public static double distancia(double x1,double x2,double y1,double y2 ) {
		return Math.sqrt(sumCuadrados(x2,-x1)+sumCuadrados(y2,-y1));
	}

	private static int sumCuadrados(double x2, double d) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
