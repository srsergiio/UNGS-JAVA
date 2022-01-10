package C10_Arreglos;

public class E106_histogramaArreglo {





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=arrNelementos(15);
		imprimir_arrNelementos(arr);
		int []arr2=histogramaArreglo(arr);
		imprrimir_histogramaArreglo(arr2);
	}
	
	public static int[] histogramaArreglo(int[]arr) {
		int [] contadores= {0,0,0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i]<10 && arr[i]>0 ) {
				contadores[arr[i]]+=1;
			}
			if ( arr[i]>10 ) {
				contadores[10]+=1;
			}
			if ( arr[i]<0 ) {
				contadores[0]+=1;
			}
		   
	}	
		return contadores;
	}	
	public static int[] arrNelementos(int n) {
		int [] arr= new int [n];
		for (int i = 0; i < n; i++) {
			arr[i]=E102_EnteroAleatorio.EnteroAleatorio(0, 15);
		}
		return arr;
	}	
	public static void imprimir_arrNelementos(int[] arr) {
		// TODO Auto-generated method stub
		for (int i : arr) {
			System.out.print(i+" ");
		}System.out.println(" ");
		
	}
	public static void imprrimir_histogramaArreglo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i==10) {
				System.out.println( "cantidad de elementos en el arreglo que son >= 10, "+arr[i]);
				}
			else if(i==0) {
				System.out.println( "cantidad de elementos en el arreglo que son  <= 0, "+arr[i]);
				}
			else if (i==i) {
				System.out.println( "cantidad de elementos en el arreglo que son  == "+i+", "+arr[i]);
				}
	}
	
	
	
	
	
	
	
	}
	
}
