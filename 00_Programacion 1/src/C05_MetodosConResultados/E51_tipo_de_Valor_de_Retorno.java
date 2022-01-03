package C05_MetodosConResultados;

public class E51_tipo_de_Valor_de_Retorno {
	/*No tamos que los metodos boolean se nombran como preguntas
	 * 
	 * */
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
	/*****************SOBRECARGA******************************/
	
	public static boolean esTriangulo(double a,double b,double c) {
		boolean bo=false;
		if(a+b>c && b+c>a && c+a>b ) {
			bo=true;
		}
			return bo;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(esTriangulo(4,2,2));
	}

}
