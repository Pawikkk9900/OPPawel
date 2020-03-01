package programowanieIO.day1502;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Ex4Zapis {
    public static void main(String[] args) {
        try (OutputStream outputStream =
                     Files.newOutputStream(Path.of("odczyt1.txt"));) {
            outputStream.write(66);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

