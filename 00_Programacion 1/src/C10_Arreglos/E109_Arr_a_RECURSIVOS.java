package C10_Arreglos;

public class E109_Arr_a_RECURSIVOS {



	

	public static void  main(String []main) {
		int [] arr = {10,4,15,23};
//		System.out.print(maximoEnRangoR(arr,0,3));
		//System.out.println(max(arr));
		System.out.println(encontrar(arr,23));
		
	}
	
	
	public static int encontrar(int [] arr ,int elemento){
		return auxiliar( arr ,  elemento,0);
//		c. Escrib� una versi�n recursiva de encontrar usando el patr�n encapsuladorauxiliar.
//		encontrar deber�a tomar un arreglo de enteros y un entero objetivo. Deber�a devolver 
//		el �ndice de la primera posici�n en la que el entero
//		objetivo aparece en el arreglo, o -1 en caso de que no aparezca.
		
	}
	
	private static int auxiliar(int[] arr, int elemento, int i) {
	
		if( i == arr.length) {
			return -1;
		}
		else if(elemento==arr[i]) {
			System.out.println(elemento+" == "+arr[i] +" recursion "+i);
			return i;
		}
		
		return auxiliar(arr,  elemento,  (i+1));
	}


	public static int max(int [] arr ){
//		b. M�todos como maximoEnRango pueden ser inc�modos de usar. Para encontrar el 
//		m�ximo de un arreglo, tenemos que proveerle el rango que incluya
//		al arreglo entero.
//		double max = maxEnRango (arreglo, 0, a.length-1);
//		Escrib� un m�todo llamado max que tome un arreglo como par�metro y que
//		use a maximoEnRango para encontrar y devolver al valor m�s alto. M�todos
//		como max son algunas veces llamados m�todos encapsuladores (o wrappers) 
//		porque proveen una capa de abstracci�n alrededor de un m�todo inc�modo de
//		usar y provee una interfaz para el mundo exterior para que sea
//		m�s f�cil de usar. El m�todo que realmente realiza los c�lculos es llamado 
//		m�todo auxiliar (o helper). Veremos este patr�n de nuevo en la Secci�n 14.9.
//		�thinkapjava� � 2012/3/1 � 14:34 � page 150 � #170
		return maximoEnRangoR( arr , 0, arr.length-1);
	}
	
	
	public static int maximoEnRango (int [] arr , int indiceBajo,int indiceAlto){
//		a. Escrib� un m�todo llamado maximoEnRango que tome un arreglo de enteros
//		y un rango de �ndices (indiceBajo e indiceAlto), que encuentre el m�ximo
//		valor del arreglo, considerando solamente los elementos entre indiceBajo
//		e indiceAlto, incluyendo ambos extremos.
		
//		Este m�todo deber�a ser recursivo. Si la longitud del rango es 1, es decir,
//		si indiceBajo == indiceAlto, sabemos inmediatamente que el �nico elemento en el 
//		rango es el m�ximo. Entonces ese es el caso base.
		
//		Si hubiera m�s de un elemento en el rango, podemos partir el arreglo en
//		dos, encontrar el m�ximo en cada parte, y luego encontrar el m�ximo entre
//		los dos m�ximos parciales.
		
		int MaxElemento = 0;
		if (indiceBajo >=0 && indiceBajo<arr.length && indiceAlto<arr.length && indiceAlto>indiceBajo) {
			for (int i = indiceAlto; i < indiceAlto+1; i++) {
				if(arr[i]>MaxElemento) {
					MaxElemento=arr[i];
				}
				
			}
		}
		return MaxElemento;
		
	}
	
	
	
	public static int maximoEnRangoR (int [] arr , int indiceBajo,int indiceAlto){
//		a. Escrib� un m�todo llamado maximoEnRango que tome un arreglo de enteros
//		y un rango de �ndices (indiceBajo e indiceAlto), que encuentre el m�ximo
//		valor del arreglo, considerando solamente los elementos entre indiceBajo
//		e indiceAlto, incluyendo ambos extremos.
		
//		Este m�todo deber�a ser recursivo. Si la longitud del rango es 1, es decir,
//		si indiceBajo == indiceAlto, sabemos inmediatamente que el �nico elemento en el 
//		rango es el m�ximo. Entonces ese es el caso base.
		
//		Si hubiera m�s de un elemento en el rango, podemos partir el arreglo en
//		dos, encontrar el m�ximo en cada parte, y luego encontrar el m�ximo entre
//		los dos m�ximos parciales.
	
		
	

			if(arr[indiceBajo]>=arr[indiceAlto]) {
				

				if(indiceBajo+1==indiceAlto || indiceBajo==indiceAlto ) {
					arr =invertirElementos( arr ,  indiceBajo, indiceAlto);
					
				}else {
//					System.out.println(arr[indiceBajo]+" "+arr[indiceAlto]);
					maximoEnRangoR ( arr ,  indiceBajo, indiceAlto-1);
				}
			}
			
			
			
			if(arr[indiceBajo]<=arr[indiceAlto]) {
				if(indiceAlto-1==indiceBajo || indiceBajo==indiceAlto ) {
					arr =invertirElementos( arr ,  indiceBajo, indiceAlto);
					 
					 
				}else {
					arr =invertirElementos( arr ,  indiceBajo, indiceAlto);
//					System.out.println(arr[indiceBajo]+" "+arr[indiceAlto]);
					maximoEnRangoR ( arr ,  indiceBajo, indiceAlto-1);
				}
			}
		
		
		return arr[indiceBajo];
	}
	
	
	
	public static int [] invertirElementos (int [] arr , int indiceBajo,int indiceAlto) {
		int guardar =arr[indiceBajo];
		arr[indiceBajo] =arr[indiceAlto];
		arr[indiceAlto] =guardar;
		return arr;
	}
	
}
