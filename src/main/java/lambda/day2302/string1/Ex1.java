package lambda.day2302.string1;

import java.util.Arrays;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class Ex1 {
    public static void main(String[] args) {
        String[] tab = { "Wsadyslaw", "Zbyszek", "Anna","Piotr", "Kasia", "Klaudia", "Jan"};
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

        Arrays.sort(tab, new WomenFirstComparator());
        System.out.println(Arrays.toString(tab));
    }
}
