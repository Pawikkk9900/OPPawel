package programowanieIO.day1602.serializowane;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class OsobaZapis {
    public static void main(String[] args) {
        Osoba osoba = Osoba.builder().age(15).name("Pawel").pesel("124213").build();
        Osoba osoba2 = Osoba.builder().age(16).name("Aa").pesel("12312").build();

        List<Osoba> o = List.of(osoba, osoba2);

        try(
                OutputStream outputStream = Files.newOutputStream(Path.of("osoba.txt"));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream))
        {
            objectOutputStream.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
