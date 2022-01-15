package C10_Arreglos;


public class E111_histogramaLetras {
	
////	Escribí un método llamado histogramaLetras que tome una String como parámetro y 
//	devuelva un histograma de las letras del String. El cero-ésimo elemento
////	del histograma deber contener la cantidad de a’s en la String (mayúsculas y minúsculas); 
//	el 25to elemento debe contener la cantidad de z’s. Tu solución debe
////	recorrer el String una sola vez.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object [][] HG = histogramaLetras("sergio esquivel saibene");
		 
		print(HG);
	 

		
	}
	
	public static Object [][] histogramaLetras(String cadena){
		Object [][] histogramadeletras = null;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if(estaguardada(histogramadeletras,cadena.charAt(i))) {
				
				histogramadeletras= contador(histogramadeletras,cadena.charAt(i));
			}else {
				
				Object  [] elemento = {cadena.charAt(i),1};
				histogramadeletras=agrandarElemento(histogramadeletras,elemento);
			}
		}
		return histogramadeletras;
		
	}
	
	
	 static Object[][] contador(Object[][] histogramadeletras, char charAt) {
		for (int i = 0; i < histogramadeletras.length; i++) {
			if((char)histogramadeletras[i][0]==charAt) {
				int cont=((int) histogramadeletras[i][1])+1;
				char letra=charAt;
				Object [] objtemp= {letra,cont};
				histogramadeletras[i]=objtemp;
			}
		}
		return histogramadeletras;
	}


	public static boolean estaguardada(Object[][] arr,char letra){
		
		boolean estaguardada=false;
		if(arr!=null) {
			
		for (int i = 0; i < arr.length; i++) {
		
			if((char)arr[i][0]==letra) {
				
				estaguardada=true;
			}
		}}
	
		return estaguardada;
		
	}
	
	public static Object [] agrandarElemento(Object[] arr,Object elemento) {
		
		if (arr==null) {
			arr=new Object [1];		
		}else {
		Object[] arrnew = new Object[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			arrnew[i]=arr[i];
		}arr=arrnew;}
		arr[arr.length-1] = elemento;
		return arr;
		
	}

	public static Object [][] agrandarElemento(Object[][] arr,Object[] elemento) {
	//	[+1] [2 slot];
		if (arr==null) {
//			System.out.println("arr is null");
			arr=new Object [1][2];
		}else {
		
		Object[][] arrnew = new Object[arr.length+1][2];
			for (int i = 0; i < arr.length; i++) {
				arrnew[i] =arr[i];
			}
			arr=arrnew;
		}
			
		arr[arr.length-1] = elemento;
		return arr;
		
	}
	
	public static void print(Object [][] r1) {
		for (int i = 0; i < r1.length; i++) {
			System.out.println("Caracter : "+r1[i][0]+" cantidades : "+r1[i][1]);
		}
	}
	public static void print(Object []  r1) {
		for (int i = 0; i < r1.length; i++) {
			System.out.println("letra : "+r1[0]+" cantidades : "+r1[1]);
		}
	}
	
	
}
