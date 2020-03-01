package programowanieIO.day1502.Zad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Wczytywanie strony internetowej
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Zad4 {
    public static void main(String[] args) {
        URL url = null;
        try {

            url = new URL("http://google.pl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = url.openStream();
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            bufferedReader.lines().forEach(e -> System.out.println(e));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

