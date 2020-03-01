package streams.day2902;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Zlicza wszystkie litrey ciagu.
 *
 * @author oppawell@gmail.com
 * @since 01.03.2020
 **/
public class Ex3 {
    public static void main(String[] args) {
        List<String> imiona = List.of("Maja", "Kacper", "Heniu");
        long count = imiona
                .stream()
                .flatMap(e -> letters(e))
                .count();
        System.out.println(count);
    }
    //ALA -> [A, L , A]
    public static Stream<String> letters (String word){
        char[] chars = word.toCharArray();
        List<String> strings = new ArrayList<>();
        for(char c : chars){
            strings.add(String.valueOf(c));
        }
        return strings.stream();
    }
}