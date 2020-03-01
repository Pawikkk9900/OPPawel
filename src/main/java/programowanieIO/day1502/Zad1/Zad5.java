package programowanieIO.day1502.Zad1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Zad5 {
    public static void main(String[] args) {

        try (OutputStream outputStream = Files.newOutputStream(Path.of("hello2.txt"));
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {
            for (int i = 0; i < 100; i++) {
                bufferedWriter.write(String.valueOf(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
