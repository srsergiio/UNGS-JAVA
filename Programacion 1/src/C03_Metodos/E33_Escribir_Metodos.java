package C03_Metodos;

public class E33_Escribir_Metodos {
	/*TEMAS:
	 * metodo : Nombre para una secuencia de sentencias que realiza algunafunci�n �til
	 * parametro :Pieza de informaci�n que se provee al llamar un m�todo
	 * argumento : Valor que se provee cuando se llama a un m�todo
	 * llamar :Causar que un m�todo sea ejecutado.
	 * */
		
 static String zool(int numero,String nombre,String calle) {
		return numero+" " +nombre+" " +calle;
	}
 
 public static void main (String[] args) {
	 System.out.print(zool(1,"flopi","el zonda"));
 }
}
