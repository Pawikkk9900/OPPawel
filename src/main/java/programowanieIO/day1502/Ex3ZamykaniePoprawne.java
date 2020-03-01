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
public class Ex3ZamykaniePoprawne {
    public static void main(String[] args) {

        try (InputStream inputStream =
                     Files.newInputStream(Path.of("odczyt1.txt"));) {
            System.out.println((char)inputStream.read());
            System.out.println((char)inputStream.read());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

