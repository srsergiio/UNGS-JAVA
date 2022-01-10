package C10_Arreglos;

public class E104_sonFactores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,4,1,8,10};
		System.out.print(sonFactores(arr,2));
	}

	public static boolean sonFactores(int[]arr ,int n) {
		boolean sonFactores = true;
		for (int i : arr) {
			if (i%n!=0) {
				sonFactores=false;
				break;
			}
		}return sonFactores;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
