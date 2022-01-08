package C09_Crea_Tus_Propio_Objeto;

public class E92_Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E92_Fecha nacimiento= new E92_Fecha(21,"marzo",1995);
		nacimiento.nacimiento();
	}
	 
	int dia;
	String mes;
	int anio;

	public E92_Fecha() {
		this.dia=0;
		this.mes=null;
		this.anio=0000;

	}
	
	public E92_Fecha(int dia, String mes,int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;

	}
	
	public void nacimiento() {
		System.out.println("naci el "+this.dia+" de "+this.mes+" de "+this.anio);
	}
	

}
