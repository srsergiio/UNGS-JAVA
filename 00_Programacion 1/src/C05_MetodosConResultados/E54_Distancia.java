package C05_MetodosConResultados;

public class E54_Distancia {
	/*El objetivo de este ejercicio es escribir un m�todo nuevo que use un m�todo
existente. Ten�s que escribir s�lo un m�todo: distancia. No ten�s que escribir
sumCuadrados o main y no ten�s que llamar a distancia*/
	
	public static double distancia(double x1,double x2,double y1,double y2 ) {
		return Math.sqrt(sumCuadrados(x2,-x1)+sumCuadrados(y2,-y1));
	}

	private static int sumCuadrados(double x2, double d) {
		return 0;
	}
	
	
}
