package C07_Cadenas_y_Cosas;
import LES.*;
public class E74_Rarificar_Lectura {
	
	public static void rarificar (int x) { //(5)(1)(0)()()()()()
	
		if (x == 0) {//(5no)(2no)(1no)()()()()()
			
			return;//▼ejecuto las lineas que quedan en Checkpoint
		} else {
			
			rarificar(x/2);//(2▲)(1▲)(0▲)()
		}
		
		System.out.print (x%2);//(Cp-5)(cp-2)(cp-1)
		//print 1
		//print 0
		//print 1
		}
	
	
		public static void main (String[] args) {
			rarificar(5);//()()()()()()()()
			System.out.println ("");//()()()()()()()()
		}

}        
