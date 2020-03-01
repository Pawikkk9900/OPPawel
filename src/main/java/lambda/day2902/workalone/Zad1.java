package lambda.day2902.workalone;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sortowanie rosnaco/malejaco
 *
 * @author oppawell@gmail.com
 * @since 29.02.2020
 **/
public class Zad1 {
    public static void main(String[] args) {
        String[] people = {"Paweł, Ala, Wojtek"};
        Arrays.sort(people, compareInDirection(false));
        System.out.println(Arrays.toString(people));
    }

    private static Comparator<String> compareInDirection(boolean asc) {
        return asc ?
                (o1, o2) -> o1.compareTo(o2)
                : (o1, o2) -> o1.compareTo(o2) * (-1);
        //lub tak
        //return (o1, o2) -> o1.compareTo(o2) * (asc ? 1 : (-1));
    }

}

