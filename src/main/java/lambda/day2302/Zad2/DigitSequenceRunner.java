package lambda.day2302.Zad2;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class DigitSequenceRunner {
    public static void main(String[] args) {
        DigitSequence digitSequence = new DigitSequence(1346);
        System.out.println("digitSequence.next() = " + digitSequence.next());
        System.out.println("digitSequence.next() = " + digitSequence.next());
        System.out.println("digitSequence.next() = " + digitSequence.next());
        System.out.println("digitSequence.next() = " + digitSequence.hasNext());
        System.out.println("digitSequence.next() = " + digitSequence.next());

        System.out.println("digitSequence.next() = " + digitSequence.hasNext());

    }
}
