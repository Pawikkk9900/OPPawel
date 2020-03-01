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
public class Ex2Zamykanie {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = Files.newInputStream(Path.of("odczyt1.txt"));
            System.out.println(inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

