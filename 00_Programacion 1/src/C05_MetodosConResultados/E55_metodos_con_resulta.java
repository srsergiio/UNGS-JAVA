package C05_MetodosConResultados;

public class E55_metodos_con_resulta {
/*Convertir ejercicio 3.5 a metodos con retorno y asignar a una variable y imprimirlas*/
	static void print(double p) {
		System.out.println(p+"");
	}
	static double multsuma(double a,double b,double c) {
		return ( a*b + c);
	}
	static double caramba(double x) {
		return x*Math.pow(Math.E, -x)+Math.sqrt(1-Math.pow(Math.E,-x));
	}
	
	
	public static void main (String[] a) {
	double	x=multsuma(2,3,5);
	double	y=caramba(83);
	print(x);
	print(y);
	}
	
}
