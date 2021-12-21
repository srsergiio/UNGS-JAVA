package C04_Condicionales_Recursion;

public class E42_Zumbido {
	
	
	public static void desconcertar (String dirigible) {
		System.out.println (dirigible); /*4ta sen : tranqueteo salto de l*/
		sipo ("ping", -5); /*5ta sen*/
	}
	public static void sipo (String membrillo, int flag) {
		if (flag < 0) {                                        /*1ra sen : 13<0 = false*/ /*7ma sen true */
			System.out.println (membrillo + " sup");			/*8sen : ping sup */
		}else {
			System.out.println ("ik");							/*2da sen :"ik salto de linea" */
			desconcertar (membrillo);							/*3ra sen :*/ /*checpoint que ejecutara al final*/
			System.out.println ("muaa-ja-ja-ja");				/*9sen que se salto en 3ra paso  */
		}
	}

/*PRINTS 
 * ik
 * tranqueteo  (dirigible)
 * ping sup *
 * muaa-ja-ja-ja"
 * 
 * */	
	
	
	
	public static void main (String[] args) {
		sipo ("traqueteo", 13);
	}
	


}
