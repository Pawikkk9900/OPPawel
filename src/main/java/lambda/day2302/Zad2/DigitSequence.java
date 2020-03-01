package lambda.day2302.Zad2;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class DigitSequence implements IntSequence {
    private int val;

    public DigitSequence(int val) {
        this.val = val;
    }
    // new DigitSequence(1346)
    //.next() -> 6
    @Override
    public int next() {
        int i = val % 10;
        val = val / 10;
        return i;
    }
    @Override
    public boolean hasNext() {
        return val != 0;
    }
}
