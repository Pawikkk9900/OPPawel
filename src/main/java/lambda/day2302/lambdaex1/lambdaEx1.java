package lambda.day2302.lambdaex1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
final class lambdaEx1 {
    public static void main(String[] args) {
        String[] tab = { "Wsadyslaw", "Zbyszek", "Anna","Piotr", "Kasia", "Klaudia", "Jan"};
        Arrays.sort(tab, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(tab));

        Arrays.sort(tab, (String o1, String o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(tab));
    }
}
