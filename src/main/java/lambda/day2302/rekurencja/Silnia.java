package lambda.day2302.rekurencja;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class Silnia {
    public static void main(String[] args) {

    }

    public static int silniaIt(int n) {
        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static int silniaRek(int n) {
        if (n == 0) {
            return 1;
        }
        return n * silniaRek(n - 1);
    }
}
