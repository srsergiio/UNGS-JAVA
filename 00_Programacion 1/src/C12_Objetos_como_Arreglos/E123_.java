package C12_Objetos_como_Arreglos;
import C11_Arr_de_Objetos.*;
public class E123_ extends E122_Mazo{
    public static E122_Mazo intercambiarCartas(E122_Mazo mazo ,int c1  ,int c2){
        E11_1_Carta cart1 = mazo.Mazo[c1];
        mazo.Mazo[c1]=mazo.Mazo[c2];
        mazo.Mazo[c2]=cart1;
        return mazo;
    }

    public static int[] OrdenAleatorio(int i){
        int [] Orden= new int[i];
        for(int j=0;j<Orden.length;j++){
            while(true){
                int random = (int) (Math.floor(Math.random() * ((i-1)-0+1)) + 0);
                if(!existeEn(Orden,random)){
                    Orden[j]=random;
                    break;
                }
            }
        }
        return Orden;
    }
    public static boolean existeEn(int [] lista,int n){
        for(int i=0;i<lista.length-1; i++){
            if(lista[i]==n){
                return true;
            }
        }
        return false;
    }
    public static void impOrdenAleatorio(int[]lista){
        for(int i=0; i < lista.length; i++){
            System.out.print(lista[i]+" , ");
        }
    }
    public static E122_Mazo mesclarMazo(E122_Mazo mazo){
        int [] lista =OrdenAleatorio(mazo.Mazo.length);
        for(int i=0; i < mazo.Mazo.length;i++){
            mazo=intercambiarCartas(mazo,i,lista[i]);
        }
        return mazo;
    }
    //enteroAleatorio 10.2
    //buscarCartaMasBaja
    //compararCarta(mazo ,desde indiceMenor,hasta indiceMayor,).

    public static void main(String []main){
        //int [] lista =OrdenAleatorio(20);
       // impOrdenAleatorio(lista);
        E122_Mazo mazo = new E122_Mazo();
        //ImprimirMazo(mazo);
        mazo = mesclarMazo(mazo);
        ImprimirMazo(mazo);

    }
}
