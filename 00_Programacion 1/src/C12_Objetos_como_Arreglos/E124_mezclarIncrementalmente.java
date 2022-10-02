package C12_Objetos_como_Arreglos;

import C11_Arr_de_Objetos.E11_1_Carta;

public class E124_mezclarIncrementalmente extends E122_Mazo {
    public static E122_Mazo mezclarIncrementalmente(E122_Mazo mazo, E11_1_Carta carta) {
        E122_Mazo m1 = new E122_Mazo(mazo.Mazo.length + 1);
        // (int) ((Math.random() * (max - min)) + min);
        int random = (int) ((Math.random() * (mazo.Mazo.length - 0)) + 0);
        m1.Mazo[random] = carta;
        boolean masuno = false;
        for (int i = 0; i < mazo.Mazo.length; i++) {
            if (i == random) {
                masuno = true;
            }
            if (masuno) {
                m1.Mazo[i + 1] = mazo.Mazo[i];
            } else {
                m1.Mazo[i] = mazo.Mazo[i];

            }
        }
        return m1;
    }

    public static void main(String[] main) {
        E11_1_Carta c1 = new E11_1_Carta(2, 999999);
        E11_1_Carta c2 = new E11_1_Carta(3, 888888);
        E122_Mazo m1 = new E122_Mazo();
        m1 = mezclarIncrementalmente(m1, c1);
        m1 = mezclarIncrementalmente(m1, c2);
        ImprimirMazo(m1);

    }
}