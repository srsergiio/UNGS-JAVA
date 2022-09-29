package C12_Objetos_como_Arreglos;
import C11_Arr_de_Objetos.E11_1_Carta; 

public class E121_buscarBinario extends E11_1_Carta  {
    
    public static  int compareTomazo(E11_1_Carta c1,E11_1_Carta c2){
        System.out.println("c1 : "+c1.palo+","+c1.valor+" c2 : "+c1.palo+","+c1.valor);
        if(c1.palo==c2.palo && c1.valor==c2.valor){
            System.out.println("c1 : "+c1.palo+","+c1.valor+" c2 : "+c1.palo+","+c1.valor);
            return 0;
        }
        if (c1.palo==c2.palo){
            return c1.valor>c2.valor?-1:1;
        }
        return  c1.palo > c2.palo ? -1:1;
    }  

    public static int buscarBinario(E11_1_Carta [] mazo,E11_1_Carta carta,int desde,int asta){
        if (desde== asta || desde<0 || desde>mazo.length)return -1;
        switch(compareTomazo(mazo[desde],carta)){
        case 0: return desde;
        case 1: return buscarBinario( mazo, carta, desde+1, asta);
        case -1: return buscarBinario( mazo, carta, desde-1, desde);
        }
        return -1;
    }
}
