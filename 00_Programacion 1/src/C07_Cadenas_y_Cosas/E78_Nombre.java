package C07_Cadenas_y_Cosas;

import LES.*;

public class E78_Nombre {
	// find,
	// toLower // todo a minuscula
	// compareTo // para comparar el largo de las cadenas

	public static void main(String[] args) {
		// print.print(tineComa("a,sda;sd"));
		print.print(convertirNombre("SERGio ESquivel"));
		print.print(compararNombre("sergio", "alberto"));
	}

	public static boolean tineComa(String Palabra) {
		int index = 0;
		boolean b = false;
		while (index < Palabra.length()) {
			if (",".charAt(0) == Palabra.charAt(index)) {
				b = true;
				break;
			}
			index++;
		}
		return b;
	}

	public static String convertirNombre(String s) {
		if (tineComa(s) == false) {
			s = ApellidoPrinero(s);
			s = ponerComa(s);

		}
		return s.toLowerCase();

	}

	public static String ponerComa(String s) {
		int index = 0;
		String palabra = "";
		while (index < s.length()) {

			if (" ".charAt(0) == s.charAt(index)) {
				palabra += ",";
			}
			palabra += s.charAt(index);
			index++;
		}
		return palabra;

	}

	public static String ApellidoPrinero(String s) {
		int index = 0;
		String nombre = "";
		String apellido = "";
		boolean espace = false;
		while (index < s.length()) {

			if (" ".charAt(0) == s.charAt(index)) {
				espace = true;
			}
			if (espace == true) {

				apellido += s.charAt(index);

			} else {
				nombre += s.charAt(index);
			}
			index++;

		}
		s = (apellido + " " + nombre);
		s = s.substring(1);
		return s;
	}

	public static int compararNombre(String name1, String name2) {
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		int n = name1.compareTo(name2);
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 0;
		} else {
			return 1;
		}

	}

}
