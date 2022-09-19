package C02_Variable_Y_Tipos;

public class E21_Fecha {
	/*TEMAS 
	 * STRING INT PRINT
	 * 
	 * */
	public static void main(String[] args) {
		String Saludo="Hola, Mundo";
		System.out.println(Saludo);
		System.out.println();
		
		String diaDeLaSemana="Sabado";
		int diaDelMes=18;
		String mes="Diciembre";
		int anio=2021;
		
		System.out.println(
				diaDeLaSemana+
				"\n"+diaDelMes+
				"\n"+mes+
				"\n"+anio
				);
		
		String Formato_Argentino="\n"+diaDeLaSemana+" "+diaDelMes+" de "+mes+" de "+anio;
		String Formato_americano="\n"+diaDeLaSemana+", "+mes+" "+diaDelMes+", "+anio;
		String Formato_europeo="\n"+diaDeLaSemana+" "+diaDelMes+" "+mes+", "+anio;
		
		System.out.println();
		System.out.println("Formato Argentino "+Formato_Argentino);
		System.out.println("Formato americano "+Formato_americano);
		System.out.println("Formato europeo "+Formato_europeo);
	}

}
