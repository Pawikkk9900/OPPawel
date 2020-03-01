package programowanieIO.day1602.serializowane.osoba;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class ZapisOsoba {
    public static void main(String[] args) {
        Osoba osoba2 = Osoba.builder()
                .age(18)
                .pesel("12312321")
                .name("Ola")
                .dzial(new Dzial("Chemik"))
                .build();
        try (
                OutputStream outputStream = Files.newOutputStream(Path.of("zapisanaOsobaNonSer.ser"));
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        ) {
            objectOutputStream.writeObject(osoba2);
            objectOutputStream.writeObject(osoba2.getDzial().getName());
//            objectOutputStream.writeInt(osoba2.getDzial().getName().length());
//            objectOutputStream.writeChars(osoba2.getDzial().getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
