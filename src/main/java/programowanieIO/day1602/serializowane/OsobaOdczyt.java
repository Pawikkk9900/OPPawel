package programowanieIO.day1602.serializowane;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class OsobaOdczyt {
    public static void main(String[] args) {
        try (
                InputStream inputStream = Files.newInputStream(Path.of("osoba.txt"));
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
            List<Osoba> o = (List<Osoba>) objectInputStream.readObject();
            System.out.println(o);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
