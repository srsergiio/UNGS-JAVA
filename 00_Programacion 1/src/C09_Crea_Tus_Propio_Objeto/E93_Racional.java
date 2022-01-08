package C09_Crea_Tus_Propio_Objeto;

public class E93_Racional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*E92_Racional obj= new E92_Racional();
		obj.imprimirRacional();
		obj= new E92_Racional(1,-2);
		obj.imprimirRacional();
		obj.invertirSigno();
		obj.imprimirRacional();
		*/
		E93_Racional fracion1=new E93_Racional(2 ,2 );
		E93_Racional fracion2=new E93_Racional(6 ,4 );
		fracion1.reducir().suma(fracion2).imprimirRacional();
	
		
	}
	
	int numerador , denominador;

	public E93_Racional() {
		this.numerador=0;
		this.denominador=0;
	}
	
	public E93_Racional(int numerador,int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	public  void invertirSigno() {
		this.numerador=-(this.numerador);
		this.denominador=-(this.denominador);
	}
	
	public static double aDouble(E93_Racional obj) {
		return obj.numerador/obj.denominador;
		
	}
	
	public  E93_Racional  reducir(){
		int MCD = MCD(this);
		this.numerador= (numerador/MCD);
		this.denominador= (denominador/MCD);
		return this;
		
	}
	
	public static   int MCD(E93_Racional OBJ) {
		int min = Math.min(OBJ.numerador, OBJ.denominador);
		while (min>1) {
			if (OBJ.numerador%min==0 && OBJ.denominador%min==0) {   
				break;
			}
			min--;
		}
		return min;
		
	}
	
	
	public E93_Racional suma(E93_Racional obj1) {
		E93_Racional obj0 = this;
		
	
		int numerador1=(obj1.denominador*obj0.numerador)+(obj0.denominador*obj1.numerador);
		int denominador1 = obj0.denominador*obj1.denominador;
		
		return new E93_Racional(numerador1,denominador1).reducir();
	}
	public  void imprimirRacional( ) {
		System.out.println("Numerador   =>"+this.numerador+
						"\nDenominador =>"+this.denominador+"\n");
		}
				
						
			
}

