package C12_Objetos_como_Arreglos;

import C11_Arr_de_Objetos.E11_1_Carta; 

class E122_Mazo extends E11_1_Carta{

    E11_1_Carta [] Mazo;

    public E122_Mazo(){
        Mazo= new E11_1_Carta[52];
        int indice=0;
        for (int p=0;p<4;p++){
            for (int v=1;v<=13;v++){
                this.Mazo[indice]= new E11_1_Carta(p,v);
                //imprimirCarta(Mazo[indice]);
                indice++;
            }
        }
    }

    public E11_1_Carta getE121_Mazo(int n){
        return this.Mazo[n];
    }
    public E11_1_Carta[] getE121_Mazo(){
        return this.Mazo;
    }

    public static  void ImprimirMazo(E122_Mazo mazo){
        String[] palos = { "Tréboles", "Diamantes", "Corazones", "Picas" };
        int i =0;
        System.out.println("\n \n \n \n \n \n \n Consola : \n");
        for(E11_1_Carta carta:mazo.getE121_Mazo() ){
            System.out.println("ubicacion : "+i+" Carta: "+ carta.valor+" de "+palos[carta.palo]);i++;
        }

    }


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

    public static int buscarBinario(E122_Mazo mazo,E11_1_Carta carta,int desde,int asta){
        if (desde== asta || desde<0 || desde>mazo.getE121_Mazo().length)return -1;
        switch(compareTomazo(mazo.getE121_Mazo(desde),carta)){
        case 0: return desde;
        case 1: return buscarBinario( mazo, carta, desde+1, asta);
        case -1: return buscarBinario( mazo, carta, desde-1, desde);
        }
        return -1;
    }


    public static void main(String[] args){
        E122_Mazo mazo1= new E122_Mazo();
        E11_1_Carta carta = new E11_1_Carta(4,1);
        ImprimirMazo(mazo1);
        System.out.println("Ubicada en : "+buscarBinario(mazo1,carta,50,51));
        
    }

}
