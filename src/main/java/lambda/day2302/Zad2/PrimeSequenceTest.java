package lambda.day2302.Zad2;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.IntStream;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class PrimeSequenceTest {

    public static void main(String[] args) {
        measurePrimes(1_000);
        measurePrimes(10_000);
        measurePrimes(100_000);
        measurePrimes(1_000_000);
    }

    private static void measurePrimes(int maxVal) {
        long l1 = System.currentTimeMillis();
        int[] ints = IntStream.rangeClosed(1, maxVal)
                .filter(e -> PrimeSequence.isPrime(e))
                .toArray();
        long l2 = System.currentTimeMillis();
        System.out.println(maxVal + " trwalo " + (l2 - l1) + "ms znaleziono " + ints.length + " liczb pierwszych.");
    }
}