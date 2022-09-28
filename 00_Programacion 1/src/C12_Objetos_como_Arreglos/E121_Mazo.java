package C12_Objetos_como_Arreglos;

import C11_Arr_de_Objetos.E11_1_Carta; 

class E121_Mazo extends E11_1_Carta{

    E11_1_Carta [] Mazo;

    public E121_Mazo(){
        Mazo= new E11_1_Carta[52];
        int indice=0;
        for (int p=0;p<4;p++){
            for (int v=1;v<=13;v++){
                System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ERROR 1");
                
                this.Mazo[indice]= new E11_1_Carta(p,v);
                System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ERROR 2");
                imprimirCarta(Mazo[indice]);
                System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ERROR 3");
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

    public static  void ImprimirMazo(E121_Mazo mazo){
        String[] palos = { "Tréboles", "Diamantes", "Corazones", "Picas" };
        int i =0;
        for(E11_1_Carta carta:mazo.getE121_Mazo() ){
            System.out.println("ubicacion : "+i+" Carta: "+ carta.valor+" de "+palos[carta.palo]);i++;
        }

    }


    public int compareTo(E11_1_Carta c2){
        System.out.println("c1 : "+this.palo+","+this.valor+" c2 : "+this.palo+","+this.valor);
        if(this.palo==c2.palo && this.valor==c2.valor){
            System.out.println("c1 : "+this.palo+","+this.valor+" c2 : "+this.palo+","+this.valor);
            return 0;
        }
        if (this.palo==c2.palo){
            return this.valor>c2.valor?-1:1;
        }
        return  this.palo > c2.palo ? -1:1;
    }  

    public static int buscarBinario(E121_Mazo mazo,E11_1_Carta carta,int desde,int asta){
        int Comperto= mazo.getE121_Mazo(desde).compareTo(carta);
        if (desde==asta) return-1;
        System.out.println("Error Busqueda: "+ Comperto);
        switch(Comperto){
        case 0: return desde;
        case 1: return buscarBinario( mazo, carta, desde+1, asta);
        case -1: return buscarBinario( mazo, carta, desde-1, asta);
        }
        return -1;
    }


    public static void main(String[] args){
        E121_Mazo mazo1= new E121_Mazo();
        E11_1_Carta carta = new E11_1_Carta(2,0);
        ImprimirMazo(mazo1);
        System.out.println("Ubicada en : "+buscarBinario(mazo1,carta,2,51));
        
    }

}
