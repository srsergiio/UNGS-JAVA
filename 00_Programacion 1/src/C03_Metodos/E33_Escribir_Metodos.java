package C03_Metodos;

public class E33_Escribir_Metodos {
	/*TEMAS:
	 * metodo : Nombre para una secuencia de sentencias que realiza algunafunción útil
	 * parametro :Pieza de información que se provee al llamar un método
	 * argumento : Valor que se provee cuando se llama a un método
	 * llamar :Causar que un método sea ejecutado.
	 * */
		
 static String zool(int numero,String nombre,String calle) {
		return numero+" " +nombre+" " +calle;
	}
 
 public static void main (String[] args) {
	 System.out.print(zool(1,"flopi","el zonda"));
 }
}
