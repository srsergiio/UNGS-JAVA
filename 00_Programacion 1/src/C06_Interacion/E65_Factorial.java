package C06_Interacion;
import Libro.*;
public class E65_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print.print(2);
		System.clearProperty("java.classpath");
	}
	
	public static double factorial(double a) {

		double factorial=a;
		while(a>1) {
			factorial=factorial*(a-1);
			a--;
		}
		return factorial;
	}

}