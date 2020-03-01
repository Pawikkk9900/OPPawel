package programowanieIO.day1602;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class Ex8OdczytBinarny {
    public static void main(String[] args) {
        try {
            InputStream inputStream = Files.newInputStream(Path.of("hello4.txt"));
            DataInputStream dataInputStream = new DataInputStream(inputStream);{

                int i = dataInputStream.readByte();
                int i2 = dataInputStream.readByte();
                int i3 = dataInputStream.readByte();
                System.out.println(i);
                System.out.println(i2);
                System.out.println(i3);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
