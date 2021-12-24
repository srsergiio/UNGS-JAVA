package C06_Interacion;

public class E67_gauss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static double gauss(int x, int n) {
		int index=0;
		double acumulador=0;
		while(index <n) {
			acumulador+=(index + 1)*Math.pow(x, index)/index;
					
		}
		return acumulador;
	}
	
	
	
	public static double potencia(double x,double n) {
		double index=0, acumulador=0;
		while(index<n) {
			acumulador+=x;
		}
		return acumulador;
	}
}
