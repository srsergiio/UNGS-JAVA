package LES;

import java.math.BigInteger;

public class BigIntegerES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static BigInteger intAbig(int x) {
		return BigInteger.valueOf (x);
	}
	public static BigInteger intAbig(double x) {
		int x2=(int)x;
		return BigInteger.valueOf (x2);
	}
	
	public static int bigAint(BigInteger x) {
		String integer= x+"";
		return Integer.valueOf(integer);
	}
	
	public static BigInteger suma(int a , int b) {
		BigInteger chico = BigInteger.valueOf (a);
		BigInteger grande = BigInteger.valueOf (b);
		return  chico.add (grande);
		
	}

	
	public static BigInteger suma(double a , double b) {
		BigInteger chico = BigInteger.valueOf ((int)a);
		BigInteger grande = BigInteger.valueOf ((int)b);
		return  chico.add (grande);
		
	}
	
	public static BigInteger potencia(int a , int b) {
		BigInteger chico = BigInteger.valueOf (a);
		return chico.pow(b);
		

	}
	public static BigInteger potencia(double a , double b) {
		BigInteger chico = BigInteger.valueOf ((int)a);
		return chico.pow((int)b);
		

	}
	public static BigInteger multiplica(int a , int b) {
		BigInteger chico = BigInteger.valueOf (a);
		BigInteger grande = BigInteger.valueOf (b);
		return chico.multiply(grande);
		
	}
	public static BigInteger multiplica(double a , double b) {
		BigInteger chico = BigInteger.valueOf ((int)a);
		BigInteger grande = BigInteger.valueOf ((int)b);
		return chico.multiply(grande);
		
	}
	
	public static BigInteger QUE_HACE_andnot(int a , int b) {
		BigInteger chico = BigInteger.valueOf (a);
		BigInteger grande = BigInteger.valueOf (b);
		return chico.andNot(grande);
		
	}
	

}
