package C07_Cadenas_y_Cosas;
import LES.*;
public class E77_duodroma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print.print(esdu�droma("aass22sdd"));

	}
	
	public static boolean esdu�droma(String s){
		boolean esdu�droma=true ;
		int i=0;
		while(i<s.length()) {	
			if(esRepetida(s.charAt(i)  ,s)==false){
				esdu�droma=false ;
				break;
			}
			i++;	
		}

		return esdu�droma;
		
	}
	
	public static boolean esRepetida(char letra ,String s){
			int i=0;
			int cont=0;
			while(i<s.length()) {
				
				if((letra == s.charAt(i) )){
					
					cont++;
				}
				
				if(cont==2){
					return true;	
				}
			i++;	
		}
			return false;	
	}
	
		

}
