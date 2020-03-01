package programowanieIO.day1602.hello5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Utworzenie pliku hello5
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class Z1 {
    public static void main(String[] args) {
        try {
            run();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void run() throws IOException {
        Files.createFile(Path.of("hello5.txt"));
        Files.move(Path.of("hello5.txt"), Path.of("hello5_1.txt"));
        Files.copy(Path.of("hello5_1.txt"), Path.of("hello5_2.txt"));
        Files.delete(Path.of("hello5_2.txt"));

    }
}




