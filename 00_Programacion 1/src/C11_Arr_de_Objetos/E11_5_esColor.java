package C11_Arr_de_Objetos;

public class E11_5_esColor extends E11_1_Carta {

    public static boolean esColor(E11_1_Carta[] mano) {
        boolean esColor = true;
        for (E11_1_Carta carta : mano) {
            esColor = mano[0].palo != carta.palo ? false : true;
            if (esColor == false)
                break;
        }
        return esColor;
    }

    public static void main(String[] args) {
        E11_1_Carta[] mano = new E11_1_Carta[4];
        mano[0] = new E11_1_Carta(2, 1);
        mano[1] = new E11_1_Carta(3, 2);
        mano[2] = new E11_1_Carta(2, 3);
        mano[3] = new E11_1_Carta(2, 4);
        System.out.println(esColor(mano));
    }
}
