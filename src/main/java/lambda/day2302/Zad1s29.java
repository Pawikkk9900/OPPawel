package lambda.day2302;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class Zad1s29 {
    public static void main(String[] args) {

        repeat(5, () -> System.out.println("Jest wesolo i zielono :"));
    }
    public static void repeat(int n, Runnable runnable) {
        for (int i = 0; i < n; i++) {
            runnable.run();
        }
    }
}
