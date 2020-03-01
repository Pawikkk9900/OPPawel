package regex.day2202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 22.02.2020
 **/
public class Ex2Name {
    public static void main(String[] args) {

        Pattern nameSurNamePattern = Pattern.compile("([a-zA-Z]+):([a-zA-Z]+$)");   // "$" wyszukuje tyko pierwsze imie+nazwisko
        Matcher matcher = nameSurNamePattern.matcher("Pawel:Maniecki, Pawel:Maniecki");

        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println("Imie :" + matcher.group(1));
            System.out.println("Nazwisko :" + matcher.group(2));

            Pattern pattern = Pattern.compile(":");

            String hourMinute = "3:50";
            String prettyHourMinute = hourMinute.replaceAll("([0-9]{1,2}):([0-9]{1,2})", "Godzina : $1, Minuta $2");
            System.out.println(prettyHourMinute);

        }
    }
}
