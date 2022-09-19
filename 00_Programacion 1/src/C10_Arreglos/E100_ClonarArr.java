package C10_Arreglos;

public class E100_ClonarArr   {

	public static void main(String[] args) {
		int[]arr1= {33,45,945,123,-0,3};
		int[]arr2= clonarArreglo2(arr1);
		imprimir(arr2);
		
	}
	
	public static int[] clonarArreglo(int[]arr){
		int [] newArr= new int[arr.length];
		for (int i=0; i<arr.length; i++){ //podemos notar que el for i in arr en JAVA es FOR int i :ARR
			newArr[i]=arr[i];
		}
		return newArr;
	}
	
	public static void imprimir(int[]arr){
		for (int x : arr){
			System.out.println(x);// X = arr[x]
		}
	}
	
	public static int[] clonarArreglo2(int[]arr){
		int [] newArr= new int[arr.length];
		int indice=0;
		for (int i:arr){ //JVscript for( var i in arr) JAVA for (int i:arr) 
			newArr[indice]=i;
			indice++;
		}
		return newArr;
	}
	
}
