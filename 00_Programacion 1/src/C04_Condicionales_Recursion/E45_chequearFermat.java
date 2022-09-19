package C04_Condicionales_Recursion;

public class E45_chequearFermat {
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static double elevarAPotencia(double x,double exponente) {
		print(Math.pow(x, exponente)+"");
	
		return Math.pow(x, exponente);
		}
	
	public static void chequearFermat(int a,int b,int c,int n) {
		if(n>2) {
			if((elevarAPotencia(a,n)+elevarAPotencia(b, n))==elevarAPotencia(c, n)) {
				print("Recorcholis, Fermat estaba equivocado!");
			}else {
				 print("�No, eso no funciona.�");

			}
		}else {
			print("tu cuarto argument tiene que ser mayor a 2");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		chequearFermat(6,8,10,2);
	}

}
