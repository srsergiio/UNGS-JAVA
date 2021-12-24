package C06_Interacion;
import Libro.print;

public class E63_raizCuadrada_NO {
	public static void main(String[]s) {
		print.print(raizCuadrada( 9));
		
		
	}
	public static double raizCuadrada(double a) throws IllegalArgumentException {

	     if (a < 0.0) throw new IllegalArgumentException();

	     double x1 = a / 2.0;
	     while (Math.abs(a - x1*x1) >= 0.0001) {  // I'd use a smaller tolerance
	          double x2 = x1;
	          x1 = (x2 + a / x2) / 2.0;
	          print.print(x1);
	     }

	     return x1 ;
	}
}
