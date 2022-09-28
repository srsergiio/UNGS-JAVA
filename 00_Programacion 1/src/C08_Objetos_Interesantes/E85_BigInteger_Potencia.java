package C08_Objetos_Interesantes;

import java.math.BigInteger;

public class E85_BigInteger_Potencia {

	public static void main(String[] args) {
		System.out.println(""+
		potencia1(2,50)+"\n"+
		potencia(2,50));
	}
	
	
	
	
	/*Sin USAR POW ni campiar sus porametro*/
	public static BigInteger potencia (int x, int n) {
		if (n==0) return new BigInteger ("1");
		// calcular x a la n/2 recursivamente
		BigInteger t = potencia (x, n/2);
		// si n es par, el resultado es t al cuadrado
		// si n es impar, el resultado es t al cuadrado por x
		if (n%2 == 0) {
		return t.multiply(t);
		} else {
		return t.multiply(t).multiply(new BigInteger (""+x));
		}
		}
	
	public static BigInteger potencia1 (int x, int n) {
		BigInteger x1= new BigInteger(x+"");
		BigInteger total= new BigInteger("1");
		if (n==0) return new BigInteger("1");
			// calcular x a la n/2 recursivamente
		else {
			int i=0;
			while(i<n) {
				total=total.multiply(x1);
				i++;
			}
				
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
