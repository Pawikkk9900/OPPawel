package lambda.day2302.Zad2;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class PrimeSequence implements IntSequence {
    public static void main(String[] args) {

    }

    private int currectPrimes = 0;
    private static int MAX_PRIME = 2000;

    @Override
    public int next() {
        currectPrimes++;
        while (!isPrime(currectPrimes)) {
            currectPrimes++;
        }
        if (currectPrimes > MAX_PRIME) {
            throw new IllegalArgumentException("Prime > " + MAX_PRIME);
        }
        return currectPrimes;
    }

    @Override
    public boolean hasNext() {
        int tmp = currectPrimes++;
        while (!isPrime(tmp)) {
            tmp++;
        }
        if (tmp > MAX_PRIME) {
            return false;
        }
        return true;
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}