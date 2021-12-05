package P1;
import java.lang.reflect.Array;

import javax.annotation.processing.Messager;

import P1.Practica1;

public class Practica2 {

	public static void Fecha(int dia,int mes,int año) {
		Practica1.Imprimir( dia+"/"+ mes+"/" +año+"");
	}
	
	public static void Fecha2(int dia,int mes,int año) {
		String meses[]={" enero"," febrero"," marzo"," abril"," mayo"," junio"," julio"," agosto"," septiembre"," optubre"," noviembre"," diciembre"};
		Practica1.Imprimir( dia+" de"+ meses[mes-1] +" de "+año+"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha2(21,3,1995);
		
	}

	


}
