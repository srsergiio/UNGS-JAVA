package C07_Cadenas_y_Cosas;
import Libro.*;
public class E79_Capitan_Crunch_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print.print(CapitanCrunch (  "abcdefghijklmnopqrstuvwxyz", 13));
		print.print("nopqrstuvwxyzabcdefghijklm  <= RESULTADO ESPERADO" );

	}
	

	
	public static String CapitanCrunch (String Codigo , int numero) {
		String code ="";
		int i =0;
		while (i<Codigo.length()) {
			if(Codigo.charAt(i)>=97 && Codigo.charAt(i)<=122) {
				code+=decodificar(97,122 ,numero,Codigo.charAt(i));
				print.print("letra = "+Codigo.charAt(i)+" => "+ decodificar(97,122 ,numero,Codigo.charAt(i))+"   Min    ");
			}else if(Codigo.charAt(i)>=65 && Codigo.charAt(i)<=90) {
				code+=(decodificar(97,122 ,numero,Codigo.charAt(i))).toUpperCase();
				print.print("letra = "+Codigo.charAt(i)+" => "+ decodificar(97,122 ,numero,Codigo.charAt(i))+" May");
			}else{
				code+=Codigo.charAt(i);
				print.print("letra = "+Codigo.charAt(i)+" => "+ decodificar(97,122 ,numero,Codigo.charAt(i))+" NO ES LETRA" );
			}
			i++;	
		}
		return code;
	}
	
	public static String decodificar ( int limMenor ,int limMayor, int corrimiento,char Acci) {	
		String letra="";

		if((Acci+corrimiento)>limMayor) {
			letra=superaLim (  limMenor , limMayor,  corrimiento, Acci); 
			
		}if((Acci+corrimiento)<=limMayor) {
			Acci=(char) (Acci+corrimiento);
			letra=Character.toString(Acci);
			
		}if((Acci+corrimiento)<=limMenor) {
			//caso donde el corrimiento de letra ba
		}
		
		return letra ;
		
		}
	 
	public static String superaLim ( int limMenor ,int limMayor, int corrimiento,char Acci) {
		Acci =Minuscula( Acci);
		String letra = "";
		if((Acci+corrimiento)>limMayor) {
			Acci =(char)( limMenor + ((Acci+corrimiento)%limMayor));
			letra=Character.toString(Acci);
		}
		
		return letra ;
		
		}
	
	public static char Minuscula(char Acci) {
		String letra=Character.toString(Acci);
		letra=letra.toLowerCase();
		return Acci=letra.charAt(0);
	}
	
	
	}


