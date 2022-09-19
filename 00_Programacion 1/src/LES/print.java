package LES;

public class print {
	
	public static void main(String [] a) {
		print(factorial(10));
	}
	
	public static double factorial(double a) {

		double factorial=a;
		while(a>1) {
			factorial=factorial*(a-1);
			a--;
		}
		return factorial;
	}
	
	
// alt + shift + r = renombra todas la variables del mismo tipo
	public static void print(Object S) {
		System.out.println(S);
	}

	public static void print(double x1) {
		// TODO Auto-generated method stub
		System.out.println(x1+"");
	}
	public static void printarr(int []arr) {
		System.out.print( " [  ");
		for (int i : arr) {
			System.out.print(i+" , ");
		}
		System.out.print( " ]  ");
	}
}
