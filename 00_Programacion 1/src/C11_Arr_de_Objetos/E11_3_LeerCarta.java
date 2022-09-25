package C11_Arr_de_Objetos;

public class E11_3_LeerCarta  extends E11_1_Carta{
    public static E11_1_Carta LeerCarta(String NombreCarta){
        String[] Palos={"pica","corazon","diamante","trebol"};
        String[] valores = { "nada", "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String [] carta =NombreCarta.split(" ");
        int palo=-1;
        int valor=0;
        for (int i=0; i<Palos.length; i++){
            palo =carta[2].equals(Palos[i])?i:0;
            if (palo!=-1)break;
        }
        for (int i=0; i<valores.length; i++){
            valor =carta[0].equals( valores[i])?i:0;
            if (valor!=0)break;
        }
        return palo==-1 || valor==0?null:new E11_1_Carta(palo, valor);
    }


    public static void main(String[] args){
        imprimirCarta(LeerCarta("3 de pica"));
    }

}
