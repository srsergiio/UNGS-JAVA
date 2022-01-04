package C08_Objetos_Interesantes;

public class E84_Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 factorial(30);
		
	
	}
	public static double factorial(double n) {
		int i=1;
		double factorial=1;
		while(i<n) {
			factorial*=i;
			i++;
			System.out.println("factorial de "+n+" => "+factorial+ " X "+ i+"							=> "+factorial*i);
		}
		return factorial;
	}
	 


	

	
}
