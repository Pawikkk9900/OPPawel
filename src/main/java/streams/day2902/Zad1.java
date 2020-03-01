package streams.day2902;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Wybiera pierwsze literki ciagow.
 *
 * @author oppawell@gmail.com
 * @since 29.02.2020
 **/
public class Zad1 {


    public static void main(String[] args) {
     List<String> strings = List.of("Ala", "Ma", "Kota");
        System.out.println("firstLetters(strings) = " + firstLetters(strings));

    }

    private static List<String> firstLetters(List<String> words) {
        return words.stream()
                .map(e-> e.substring(0, 1))
                .collect(Collectors.toList());
    }
    public static Stream<String> latters (String word){
        char[] chars = word.toCharArray();
        List<String> strings = new ArrayList<>();
        for (char c : chars){
            strings.add(String.valueOf(c));
        }
        return strings.stream();
    }
}
