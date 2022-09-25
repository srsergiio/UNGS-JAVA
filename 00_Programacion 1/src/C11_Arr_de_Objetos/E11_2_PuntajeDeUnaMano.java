package C11_Arr_de_Objetos;


public class E11_2_PuntajeDeUnaMano extends E11_1_Carta{

    public static int PuntajeDeUnaMano(E11_1_Carta[]mano){
        int puntaje = 0;
        for ( E11_1_Carta carta : mano ) {
            puntaje= carta.valor>=10? puntaje+=10: puntaje+carta.valor;
        }
        return puntaje;
    }


    public static void main(String[] args) {
        E11_1_Carta [] mano = new E11_1_Carta[4];
        mano [0]= new E11_1_Carta(1,1);
        mano [1]= new E11_1_Carta(2,10);
        mano [2]= new E11_1_Carta(3,13);
        mano [3]= new E11_1_Carta(2,3);
        System.out.println(PuntajeDeUnaMano(mano));



    }

}
