package C07_Cadenas_y_Cosas;

public class E73_Invertirdigitos {

	public static void main(String []a) {
		int numero = 17;
		int ultimoDigito = numero%10;
		int primerDigito = numero/10;
		System.out.println (ultimoDigito + primerDigito);
		int numero1 = 17;
		String ultimoDigito1 =""+numero1;
		ultimoDigito1 = ""+ultimoDigito1.charAt(1)+ultimoDigito1.charAt(0);
		numero1=Integer.parseInt(ultimoDigito1);
		System.out.println (numero1);
		
		
	}
	
	
	}
