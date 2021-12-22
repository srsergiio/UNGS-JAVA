package C05_MetodosConResultados;

public class E57_Ackerman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Ack(3,2)+"");
	}
	public static double Ack(int m , double n) {
		if(m==0) {
			return n+1;
		}
		else if(m>0 && n==0) {
			return Ack(m-1,1);
			 
		}else {
			return Ack(m-1,Ack(m,n-1));
		}
	
		
		
		
	}
}
