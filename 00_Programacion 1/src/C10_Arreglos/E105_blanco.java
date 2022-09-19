package C10_Arreglos;

public class E105_blanco {

	public static void main(String[] args) {
		int [] arr= {2,3,5,8,1,67,98,2};
		System.out.print(blanco(arr,100));
				
	}
	
	
	
	
	public static int blanco(int[]arr,int blanco) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==blanco) {
					return i;
			}
		} 	
		return -1;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
