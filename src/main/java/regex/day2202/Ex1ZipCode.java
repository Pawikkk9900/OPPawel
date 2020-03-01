package regex.day2202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 22.02.2020
 **/
public class Ex1ZipCode {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("[0-9]{2}-[0-9]{3}");
        Matcher matcher = compile.matcher("01-984");
        System.out.println(matcher.matches()); // true

        Matcher matcher1 = compile.matcher("098-999");
        System.out.println(matcher1.matches()); // false

        boolean matches = Pattern.matches("[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+", "oppawell@gmail.com"); // wzor na zapisanie maila regex"opis znakow" input "oczekiwane"
        System.out.println(matches);

        boolean matches2 = Pattern.matches("[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+", "oppawell@poczta.intera.pl");
        System.out.println(matches2);

        boolean matches3 = Pattern.matches("[a-zA-Z]+@([a-zA-Z]+\\.[a-zA-Z]+)+", "oppawell@poczta.intera.pl");
        System.out.println(matches3);
        //zamiast tego lepiej patter.matcher

    }
}
