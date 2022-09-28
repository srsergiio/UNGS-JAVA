package C08_Objetos_Interesantes;

import java.math.BigInteger;
public class E84_BigInteger_Factorial {

	public static void main(String[] args) {
		factorialBI(30);
		
		/*
		int i=1;
		while(i<=30) {
		factorial(i);
		
		i++;
		}
		/**/
		
		/**
		int a=2;
		int b=3;
		QUE_HACE_pow( a ,  b);
		QUE_HACE_ADD( a , b);
		QUE_HACE_multiply( a ,  b);
		QUE_HACE_andnot( a ,  b);
		**/
	}
	public static double factorial(double n) {
		int i=1;
		double factorial=1;
		while(i<n) {
			
			factorial*=i;
			i++;
			
		}
		System.out.println("factorial de "+n+" => "+factorial);
		return factorial;
	}
	
	
	
	public static BigInteger factorialBI(int n) {
		int i=1;
		BigInteger factorial=new BigInteger("1");
		while(i<n) {
			System.out.println("factorialBIG de "+i+" => "+factorial);
			factorial=factorial.multiply(new BigInteger(i+""));
			i++;	
			
		}
		System.out.println("factorialBIG de "+n+" => "+factorial);
		return factorial;
	}
	
	 
	public static BigInteger intAbig(int x) {
		return new BigInteger(""+x);
	}
	
	public static int bigAint(BigInteger x) {
		String integer= x+"";
		return Integer.valueOf(integer);
	}
	
	public static void QUE_HACE_ADD(int a , int b) {
		BigInteger chico = BigInteger.valueOf (a);
		BigInteger grande = BigInteger.valueOf (b);
		BigInteger total = chico.add (grande);
		System.out.println("a.add.(b); que hace ? \n"+
							"-BigInteger a \n"+
							"-BigInteger b \n"+
							a+".add.("+b+"); => "+total+"\n- SUMA\n");

	}
	public static void QUE_HACE_pow(int a , int b) {
		BigInteger chico = BigInteger.valueOf (a);
		//BigInteger grande = BigInteger.valueOf (b);
		BigInteger total = chico.pow(b);
		System.out.println("a.pow.(b); que hace ? \n"+
				"-BigInteger a \n"+
				"-int 	    b \n"+
				a+".pow.("+b+"); => "+total+"\n- POTENCIA|ELEVA \n");

	}
	public static void QUE_HACE_multiply(int a , int b) {
		BigInteger chico = BigInteger.valueOf (a);
		BigInteger grande = BigInteger.valueOf (b);
		BigInteger total = chico.multiply(grande);
		System.out.println("a.multiply.(b); que hace ? \n"+
							"-BigInteger a \n"+
							"-BigInteger b \n"+
							a+".multiply.("+b+"); => "+total+"\n- MULTIPLICA\n");

	}
	
	public static void QUE_HACE_andnot(int a , int b) {
		BigInteger chico = BigInteger.valueOf (a);
		BigInteger grande = BigInteger.valueOf (b);
		BigInteger total = chico.andNot(grande);
		System.out.println("a.andNot.(b); que hace ? \n"+
							"-BigInteger a \n"+
							"-BigInteger b \n"+
							a+".andNot.("+b+"); => "+total+"\n- NOSE\n");

	}

	

	
}
