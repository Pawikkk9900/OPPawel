package programowanieIO.day1502;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Ex5OdczytZnakowy {
    public static void main(String[] args) {
        try(InputStream inputStream = Files.newInputStream(Path.of("odczyt1.txt"));
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream))
        {
            int read = inputStreamReader.read();
            System.out.println((char) read);

        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
