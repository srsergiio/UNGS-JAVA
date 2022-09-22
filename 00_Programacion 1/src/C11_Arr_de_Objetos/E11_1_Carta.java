package C11_Arr_de_Objetos;

public class E11_1_Carta {
    /**Encapsulá este código que construye mazos dentro de un método llamado
construirMazo que no tome parámetros y que devuelva un arreglo de Cartas to-
talmente lleno. */
    int palo ,  valor;

    public E11_1_Carta(){
        this.palo =0;
        this.valor =0;
    }

    public E11_1_Carta(int palo, int valor){
        this.palo =palo;
        this.valor =valor;
    }

    public static void imprimirCarta (E11_1_Carta c) {
        String[] palos = { "Tréboles", "Diamantes","Corazones", "Picas" };
        String[] valores = { "nada", "As", "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K" };
        System.out.println (valores[c.valor] + " de " + palos[c.palo]);
        }


    public static E11_1_Carta[] construirMazo(){
        E11_1_Carta [] mazo = new E11_1_Carta[52];
        System.out.println("el mazo tiene una longitud de :"+mazo.length);
        int palo=0 , valor=1 , carta=0;
        while(true){
            mazo [carta]= new E11_1_Carta(palo ,valor);
            palo= valor ==13? palo+=1:palo;
            valor= valor<13? valor+=1: 1;
            carta++;
            if (carta>mazo.length-1)break;
        }
        return mazo;
    }

    public static void imprimirmazo (E11_1_Carta []mazo) {
        for(int carta = 0;carta<mazo.length;carta++){
            imprimirCarta(mazo[carta]);
        }
    }

    public static Boolean busqueda_binaria(E11_1_Carta [] mazo,E11_1_Carta carta) {
        return false;
    }
    public static int busqueda_Lineal(E11_1_Carta []mazo,E11_1_Carta carta) {
        int resultado = -1;
        for (int i =0;i<mazo.length; i++){
            resultado =  mazo[i]==carta? resultado=i:resultado;
            if(resultado!=-1){
                break;
            }
        }
        return resultado;
    }


        public static void main(String[] args) {
            E11_1_Carta objeto= new E11_1_Carta();
            objeto = new E11_1_Carta(1,8);
            imprimirCarta(objeto);
            E11_1_Carta [] mazo =  construirMazo ();
            imprimirmazo(mazo);

        }
}
