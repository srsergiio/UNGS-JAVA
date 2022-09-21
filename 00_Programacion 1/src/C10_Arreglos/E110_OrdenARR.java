package C10_Arreglos;


public class E110_OrdenARR {
//	Una manera no muy eficiente de ordenar los elementos de un arreglo es 
//	encontrar el mayor e intercambiarlo con el primero, despu�s encontrar el segundo
//	mayor, e intercambiarlo con el segundo, y as� siguiendo.
//	
public static void main (String []sljdhgfoliksdfjhglksdfg) {
	int [] arr = {1,3,5,6,4,2};
	
	
	
	arr = ordenarArreglo( arr);

	printarr(arr);
	
	
}

		public static int indiceDeMaximoEnRango (int [] arr , int indiceBajo ){
//				a. Escrib� un m�todo llamado indiceDeMaximoEnRango que tome un arreglo
//				de enteros, encuentre el mayor elemento en el rango dado, y devuelva su
//				�ndice. Pod�s modificar tu versi�n recursiva de maximoEnRango o empezar
//				una versi�n iterativa desde cero.
			//	
		int MaxElemento = arr[indiceBajo];
		int index = 0;
		if (indiceBajo >=0 && indiceBajo<arr.length) {
			for (int i = indiceBajo; i < arr.length; i++) {
				if(arr[i]>=MaxElemento) {
					MaxElemento=arr[i];
					index = i;
					
				}
				
			}
		}
		return index;
		
	}
		
		public static int [] intercambiarElemento (int [] arr , int a,int b) {
//			b. Escrib� un m�todo llamado intercambiarElemento que tome un arreglo de
//			enteros y dos �ndices, y que intercambie los elementos de los �ndices dados.
		//	
			int guardar =arr[a];
			arr[a] =arr[b];
			arr[b] =guardar;
			return arr;
		}
		
		
		public static int [] ordenarArreglo(int []arr){
			int[] arr1 = arr;
//			c. Escrib� un m�todo llamado ordenarArreglo que tome un arreglo de enteros
//			y que use indiceDeMaximoEnRango e intercambiarElemento para ordenar
//			el arreglo de mayor a menor.
			for (int i = 0; i < arr1.length; i++) {
				arr1 = intercambiarElemento (arr,i,indiceDeMaximoEnRango (arr ,  i));	
			}			
			return arr;
		}

		public static void printarr(int []arr) {
			System.out.print( " [  ");
			for (int i : arr) {
				System.out.print(i+" , ");
			}
			System.out.print( " ]  ");
		}
	}