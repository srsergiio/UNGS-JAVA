package C07_Cadenas_y_Cosas;
import LES.*;
public class E71_Prueba_Contatenacion {

	public static void main(String[] args) {
		sumaStringChart("SERGIO.",'E');/*SUMA DE STRING + CHAR FORMAN UN STRING*/
		suma_Boolean_String(true,"sergio") ;
		suma_Char_Char('E','E');
		char x2='a';//ACCI
	
		char b=x2++;//Suma el valor del Acci mas 1
		print.print((char)b);
	}
	
	
	
	public static void sumaStringChart(String palabra,char letra) {
		String TipodeArchivopordefecto = palabra+letra;
		print.print("String + Char = String : "+TipodeArchivopordefecto);
	}
	
	
	public static void suma_Boolean_boolean(boolean a,boolean b) {
		//  print.print(a+b);// no se puede sumar boolean
	}
	
	public static void suma_Boolean_char(boolean a,char b) {
		//	Object TipodeArchivopordefecto = a+b;
		//  print.print(a+b);// no se puede sumar char y boolean
	}
	
	public static void suma_Boolean_char(boolean a,int b) {
	//	  Object TipodeArchivopordefecto = a+b;
	//  print.print(a+b);// no se puede sumar char y INT
	}
	
	public static void suma_Boolean_String(boolean a,String b) {
		String TipodeArchivopordefecto = a+b;
		print.print("Boolean + String = String : "+ TipodeArchivopordefecto);
	}
	
	public static void suma_Char_Char(char a,char b) {
		int     TipodeArchivopordefecto = a+b;
		print.print("char + char = int : "+TipodeArchivopordefecto);
		
	}
	
	public static void suma_Char_int(char a,int b) {
		int TipodeArchivopordefecto = a+b;
		print.print("char + int = int : "+TipodeArchivopordefecto);
	}
	
	public static void suma_Char_Str(char a,String b) {
		String TipodeArchivopordefecto = a+b;
		print.print("char + String = String : "+ TipodeArchivopordefecto); 
	}
	
	public static void suma_INT_Str(int a,String b) {
		String TipodeArchivopordefecto = a+b;
        print.print("INT + STRING = STRING : "+TipodeArchivopordefecto);// 
	}

	
	
}
