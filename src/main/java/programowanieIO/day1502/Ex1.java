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
public class Ex1 {
    public static void main(String[] args) {


        Path path = Path.of("odczyt1.txt");
        try {
            InputStream inputStream = Files.newInputStream(path);

            int read = inputStream.read();
            System.out.println(read);
            System.out.println(inputStream.read());

            inputStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
