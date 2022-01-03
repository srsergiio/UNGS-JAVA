package C05_MetodosConResultados;

public class Ej511_MCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(mcd(36,20));
	}
	public static int mcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			print(b+","+a+"%"+b);
			return mcd(b, a%b);
		}
			
	}
	public static void print( Object s) {
		System.out.println(s);
	}
}
