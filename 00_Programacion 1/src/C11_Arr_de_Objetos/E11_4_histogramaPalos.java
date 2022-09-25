package C11_Arr_de_Objetos;

public class E11_4_histogramaPalos extends E11_1_Carta{

    public static void histogramaPalos(E11_1_Carta [] mano){
        int pica=0,corazon=0,diamante=0,trebol=0;
        int porcentaje = 100/mano.length;

        for(E11_1_Carta carta:mano){
            pica =carta.palo==0?pica+=porcentaje:pica;
            corazon =carta.palo==1?corazon+=porcentaje:corazon;
            diamante =carta.palo==2?diamante+=porcentaje:diamante;
            trebol =carta.palo==3?trebol+=porcentaje:trebol;
        }
        System.out.println("pica : "+pica+"% corazon : "+corazon+"% diamante : "+diamante+"% trebol : "+trebol+"%");
    }

    public static void main(String[] args) {
        E11_1_Carta [] mano= new E11_1_Carta[4];
        mano [0] = new E11_1_Carta(1,3);
        mano [1] = new E11_1_Carta(1,3);
        mano [2] = new E11_1_Carta(1,3);
        mano [3] = new E11_1_Carta(1,3);
        histogramaPalos(mano);
    }
}
