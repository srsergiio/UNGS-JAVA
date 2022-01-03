package C06_Interacion;

public class E64_potencia {
	
	public static void main(String[] s) {
		print(potencia(2,15));
	}
	
	public static double potencia(double x, double n) {
		double i=n-1;
		double Acum =x;
		while (i>0) {
			Acum=Acum*x;
			i--;
		}
		return Acum;
	}
	public static void print(Object  d) {
		System.out.println(d);
	}
}
