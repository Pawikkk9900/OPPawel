package lambda.day2302.Zad2;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class SquareSequence implements IntSequence {
    private int currSquare = 0;
    @Override
    public int next() {
        currSquare++;
        return currSquare * currSquare;
    }
}
