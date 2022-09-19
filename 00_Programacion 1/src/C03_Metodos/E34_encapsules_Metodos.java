package C03_Metodos;

public class E34_encapsules_Metodos {
/*TEMA :Encapsular Ejercicio del cap 2
 * 
 * 
 * 
 * */
	static String imprimirNorteamericano(String diaDeLaSemana, int diaDelMes ,String mes,int anio) {
		return diaDeLaSemana+", "+mes+" "+diaDelMes+", "+anio;	
	}
	static String imprimirSudamericano(String diaDeLaSemana, int diaDelMes ,String mes,int anio) {
		return diaDeLaSemana+" "+diaDelMes+" de "+mes+" de "+anio;
	}

	public static void main(String[] args) {
		System.out.println(imprimirNorteamericano("sabado",19,"diciembre",2021));
		System.out.println(imprimirSudamericano("sabado",19,"diciembre",2021));
	}

}
