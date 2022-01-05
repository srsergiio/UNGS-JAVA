package C07_Cadenas_y_Cosas;
import LES.*;
public class E77_duodroma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print.print(esduódroma("aass22sdd"));

	}
	
	public static boolean esduódroma(String s){
		boolean esduódroma=true ;
		int i=0;
		while(i<s.length()) {	
			if(esRepetida(s.charAt(i)  ,s)==false){
				esduódroma=false ;
				break;
			}
			i++;	
		}

		return esduódroma;
		
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
