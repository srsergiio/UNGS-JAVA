package P1;
import java.lang.reflect.Array;

import javax.annotation.processing.Messager;

import P1.Practica1;

public class Practica2 {

	public static void Fecha(int dia,int mes,int a�o) {
		Practica1.Imprimir( dia+"/"+ mes+"/" +a�o+"");
	}
	
	public static void Fecha2(int dia,int mes,int a�o) {
		String meses[]={" enero"," febrero"," marzo"," abril"," mayo"," junio"," julio"," agosto"," septiembre"," optubre"," noviembre"," diciembre"};
		Practica1.Imprimir( dia+" de"+ meses[mes-1] +" de "+a�o+"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha2(21,3,1995);
		
	}

	


}
