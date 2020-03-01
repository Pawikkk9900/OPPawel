package programowanieIO.day1602.Zad17;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 19.02.2020
 **/
public class OdczytPojazdu {
    public static void main(String[] args) {

        try(InputStream inputStream = Files.newInputStream(Path.of("ListaPojazdów.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            Pojazd pojazd = (Pojazd) objectInputStream.readObject();

            System.out.println(pojazd);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } ;
    }
}
