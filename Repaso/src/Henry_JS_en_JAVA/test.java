package Henry_JS_en_JAVA;

public class test {
	static boolean  tieneTresDigitos1(int numero){
		  //Leer un n�mero entero y retornar true si tiene 3 d�gitos. Caso contrario, retorna false.
		  //Escribe tu c�digo aqu�
		if(numero>0){
		    switch ((numero+"").length()){
		      case 3: return true; 
		      default: return false;
		    }
		  }else{ 
		      switch ((numero+"").length()){
		        case 4: return true; 
		        default: return false;
		    }
		  }
		
		}
	static int doWhile(int numero) {
		  //Implementar una funci�n tal que vaya aumentando el valor recibido en 5 hasta un l�mite de 8 veces
		  //Retornar el valor final.
		  //Usar el bucle do ... while.
		  var i =0;
		  do{
		    i++;
		    numero+=5;

		  }while(i<8);
		  return numero;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(tieneTresDigitos1(-00));
		System.out.println(doWhile(-1));
	}

}
