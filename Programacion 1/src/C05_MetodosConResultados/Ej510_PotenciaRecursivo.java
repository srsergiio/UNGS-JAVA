package C05_MetodosConResultados;

public class Ej510_PotenciaRecursivo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(potencia(2,5));
	}

	private static double potencia(double x, int n) {	
		// TODO Auto-generated method stub
	
		if(n==0) {
			return 1;
		}		
		if(n==0) {
			return n;
		}else {
			return  x * potencia (x, n-1);
		}
	}
	public static void print(Object s) {
		System.out.println(s);
	}
	
	

}
