package C06_Interacion;
import LES.*;
public class E66_miexp_FCompletar {

	public static void main(String[] args) {
		int x=1;
		print.print(miexp(x,2));
		print.print(Math.exp(2));
		
		
	}
	public static double miexp(double x,double n) {
		int expDeno=1;
		double acumulador=0;
		while(expDeno<n+1) {
			
			acumulador+=((Math.pow(x, expDeno))/expDeno);
			expDeno++;
		}
		return acumulador;
	}
	
	
}
