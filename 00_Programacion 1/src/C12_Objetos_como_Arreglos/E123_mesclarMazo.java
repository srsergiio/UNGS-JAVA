package C12_Objetos_como_Arreglos;

import C11_Arr_de_Objetos.*;

public class E123_mesclarMazo extends E122_Mazo {
    public static E122_Mazo intercambiarCartas(E122_Mazo mazo, int c1, int c2) {
        E11_1_Carta cart1 = mazo.Mazo[c1];
        mazo.Mazo[c1] = mazo.Mazo[c2];
        mazo.Mazo[c2] = cart1;
        return mazo;
    }

    public static int[] OrdenAleatorio(int i) {
        int cambiar = -1;
        int[] Orden = new int[i];
        for (int j = 0; j < Orden.length; j++) {
            while (true) {
                int random = (int) (Math.floor(Math.random() * (i - 1 + 1)) + 1);
                if (!existeEn(Orden, random)) {
                    Orden[j] = random;
                    cambiar = random == i ? j : cambiar;
                    break;
                }
            }
        }
        Orden[cambiar] = 0;
        return Orden;
    }

    public static boolean existeEn(int[] lista, int n) {
        for (int i = 0; i < lista.length - 1; i++) {
            if (lista[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void impOrdenAleatorio(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " , ");
        }
    }

    public static E122_Mazo mesclarMazo(E122_Mazo mazo) {
        int[] lista = OrdenAleatorio(mazo.Mazo.length);
        for (int i = 0; i < mazo.Mazo.length; i++) {
            mazo = intercambiarCartas(mazo, i, lista[i]);
        }
        return mazo;
    }

    public static int elmenor(E122_Mazo mazo, int desde) {
        int menor = desde;
        for (int i = desde; i < mazo.Mazo.length; i++) {
            menor = compareTomazo(mazo.Mazo[menor], mazo.Mazo[i]) == -1 ? i : menor;
        }
        return menor;
    }

    public static E122_Mazo OrdenMenorMayor(E122_Mazo mazo) {
        for (int i = 0; i < mazo.Mazo.length; i++) {
            int menor = elmenor(mazo, i);
            mazo = intercambiarCartas(mazo, i, menor);
        }
        return mazo;
    }

    // enteroAleatorio 10.2
    // buscarCartaMasBaja
    // compararCarta(mazo ,desde indiceMenor,hasta indiceMayor,).

    public static void main(String[] main) {
        // int[] lista = OrdenAleatorio(20);
        // impOrdenAleatorio(lista);
        E122_Mazo mazo = new E122_Mazo();
        mazo = mesclarMazo(mazo);
        ImprimirMazo(mazo);
        mazo = OrdenMenorMayor(mazo);
        ImprimirMazo(mazo);
    }
}
