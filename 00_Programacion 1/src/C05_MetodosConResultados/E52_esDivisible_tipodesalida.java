package C05_MetodosConResultados;

public class E52_esDivisible_tipodesalida {
	public static void print(String s) {
		System.out.println(s);
	}
	public static void print(boolean s) {
		System.out.println(s +"");
	}
	public static void print(int s) {
		System.out.println(s);
	}
	public static void print(double s) {
		System.out.println(s);
	}
	public static boolean esDivisible(double n ,double n2) {
		boolean bo = false;
		if(n%n2==0) {
			bo=true;
		}
		return bo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<99999*999999;i++) {
			print (i);
		print(esDivisible(i,2));
		}
	}
}
