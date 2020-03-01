package programowanieIO.day1502.Zad1;

/**
 * Zamiana bajtow na stringi
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Zad6 {
    public static void main(String[] args) {

        byte[] tab = {80, 105, 101, 110, 105, -60, -123, 100, 122, 101, 32, 116, 111, 32, 110, 105, 101, 32, 119, 115, 122, 121, 115, 116, 107, 111};

        String przyslowie = new String(tab);
        System.out.println(przyslowie);
    }
}