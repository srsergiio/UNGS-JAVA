package C02_Variable_Y_Tipos;

public class E22_Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora,minutos,segundos;
		hora=9;
		minutos=9;
		segundos=44;
		
		float segundos_transcurrido = ((hora*60)*60)+(minutos*60)+segundos;
		float segundos_que_quedan = (24*60*60)-segundos_transcurrido;
		float porcentaje_del_dia = (segundos_transcurrido*100)/(segundos_transcurrido+segundos_que_quedan);
		double porcentaje_del_dia2 = (segundos_transcurrido*100)/(segundos_transcurrido+segundos_que_quedan);
		
		System.out.println(
				"\n horas del dia a segundos : "+segundos_transcurrido+
				"\n horas del dia que quedan : "+segundos_que_quedan+
				"\n float porcentaje del dia que queda : "+porcentaje_del_dia+"%"+
				"\n double porcentaje del dia que queda : "+porcentaje_del_dia2+"%");
	}

}
