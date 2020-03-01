package lambda.day2902;

import lambda.day2302.Zad2.IntSequence;

import java.util.Random;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 29.02.2020
 **/
public class Zad2S45 {
    public static void main(String[] args) {
        IntSequence intSequence = randomInts(0, 10);
        System.out.println("intSequence.next() = " + intSequence.next());
        System.out.println("intSequence.next() = " + intSequence.next());
        System.out.println("intSequence.next() = " + intSequence.next());
        System.out.println("intSequence.next() = " + intSequence.next());
        System.out.println("intSequence.next() = " + intSequence.next());
    }

    //klasa lokalna
    public static IntSequence randomInts(int min, int max) {
        class RandomInts implements IntSequence {
            Random random = new Random(5);

            @Override
            public int next() {
                return random.nextInt(max + 1) + min;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        }
        return new RandomInts();
    }

    //anonimowa klasa wewnetrzna
    public static IntSequence randomInts2(int min, int max) {
        return new IntSequence() {
            Random random = new Random();

            @Override
            public int next() {
                return random.nextInt(max + 1) + min;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };
    }

    //lambda
    public static IntSequence randomInts3(int min, int max) {

        Random random = new Random(5);
        return () -> random.nextInt(max + 1) + min;

    }
}