package C11_Arr_de_Objetos;

public class E11_1_Carta {
    /**
     * Encapsulá este código que construye mazos dentro de un método llamado
     * construirMazo que no tome parámetros y que devuelva un arreglo de Cartas to-
     * talmente lleno.
     */
    int palo, valor;

    public E11_1_Carta() {
        this.palo = 0;
        this.valor = 0;
    }

    public E11_1_Carta(int palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public static void imprimirCarta(E11_1_Carta c) {
        String[] palos = { "Tréboles", "Diamantes", "Corazones", "Picas" };
        String[] valores = { "nada", "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        System.out.println(valores[c.valor] + " de " + palos[c.palo]);
    }

    public static E11_1_Carta[] construirMazo() {
        E11_1_Carta[] mazo = new E11_1_Carta[52];
        System.out.println("el mazo tiene una longitud de :" + mazo.length);
        int palo = 0, valor = 1, carta = 0;
        while (true) {
            mazo[carta] = new E11_1_Carta(palo, valor);
            // alternario para usar 3 indices
            palo = valor == 13 ? palo += 1 : palo;
            valor = valor < 13 ? valor += 1 : 1;
            carta++;
            if (carta > mazo.length - 1)
                break;
        }
        return mazo;
    }

    public static void imprimirmazo(E11_1_Carta[] mazo) {
        for (int carta = 0; carta < mazo.length; carta++) {
            imprimirCarta(mazo[carta]);
        }
    }

    public static boolean esmayor(E11_1_Carta carta1, E11_1_Carta carta2) {
        return carta1.palo > carta2.palo && carta1.valor > carta2.valor ? true : false;
    }

    public static int busqueda_binaria(E11_1_Carta[] mazo, E11_1_Carta carta, int i, int hasta) {
        if (mazo[i].equals(carta)) {
            return i;
        }
        return esmayor(mazo[i], carta)?busqueda_binaria(mazo, carta,i-1, i):busqueda_binaria(mazo, carta, i+1, mazo.length);
        
    }

    public boolean equals(E11_1_Carta carta) {
        return this.valor == carta.valor && this.palo == carta.palo ? true : false;
    }

    public static int busqueda_Lineal(E11_1_Carta[] mazo, E11_1_Carta carta) {
        int resultado = -1;
        for (int i = 0; i < mazo.length; i++) {
            resultado = mazo[i].equals(carta) ? i : resultado;
            if (resultado != -1) {
                break;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        E11_1_Carta objeto = new E11_1_Carta();
        objeto = new E11_1_Carta(2, 8);
        E11_1_Carta[] mazo = construirMazo();
        System.out.println("la carta esta en la posicion " + busqueda_Lineal(mazo,objeto));
        imprimirCarta(objeto);
        imprimirCarta(mazo[busqueda_Lineal(mazo,objeto)]); 
        imprimirCarta(mazo[busqueda_binaria(mazo,objeto,(mazo.length/2),mazo.length)]);
    }
}
