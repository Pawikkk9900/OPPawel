package regex.day2202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 * @author oppawell@gmail.com
 * @since 22.02.2020
 **/
public class Ex5Zad1 {
    public static void main(String[] args) {
        String html = "<html><body></body></html>";
        Pattern compile = Pattern.compile("(<.*?>)");
        Matcher matcher = compile.matcher(html);
        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
    }

}
