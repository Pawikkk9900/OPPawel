package programowanieIO.day1502;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Zad1OdczytWszystkich {
    public static void main(String[] args) {
        readFile("odczyt1.txt");
    }

    public static void readFile(String fileName) {
        Path path = Path.of(fileName);
        try (InputStream inputStream = Files.newInputStream(path)) {
            int read = 0;
            while ((read = inputStream.read()) != -1) {
                System.out.println((char) read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

