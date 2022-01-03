package C06_Interacion;

public class E61_ciclar_infinito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ciclar (5);
		
		/*se podria usar para un programa que se ejecute en el tiempo*/
	}
	public static void ciclar(int n) {
		int i = n;
		while (i > 0) {
			System.out.println (i);
			if (i%2 == 0) {
				print("entro i%2 ==0 ");
				i = i/2;
			} else {
				print("else ");
			i = i+1;
			}
		}
	}
	
	public static void print(Object s) {
		System.out.println(s);
	}
}
