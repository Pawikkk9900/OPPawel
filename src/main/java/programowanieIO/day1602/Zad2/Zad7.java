package programowanieIO.day1602.Zad2;

/**
 * Tym razem zrobiłem to tak, że bajty zostały przeze mnie zaszyfrowane.
 * Do każdego bajtu dodałem wartość odpowiednio o tyle na której pozycji stoi – pierwszy bajt stoi na pozycji 0.
 * Np.:
 * 60, 65, 77
 * Wcześniej te bajty miały odpowiednio wartości:
 * 60, 64, 75
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Zad7 {
    public static void main(String[] args) {

        int[] tab = {68, 112, 100, 117, 125, 37, 118, 118, 107, 131, -50, -112, 128, 114, 121, 47, 132, 128, 50, 131, 131, -38, -104, 134, 143, 122, 58, 141, 139, 127, 141, 147, 153, 79};
        byte[] tab2 = new byte[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = (byte) (tab[i] - i);

        }
        String przyslowie = new String(tab2);
        System.out.println(przyslowie);
    }
}

