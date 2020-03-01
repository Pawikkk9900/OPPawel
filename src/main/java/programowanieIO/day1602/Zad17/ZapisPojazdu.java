package programowanieIO.day1602.Zad17;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 19.02.2020
 **/
public class ZapisPojazdu {
    public static void main(String[] args) {

        Pojazd pojazd = Pojazd.builder().Marka("Kawasaki").Model("Z").Pojemnosc_cc(750).NrRrejestracyjny("WN_12414214").Cena(16000).build(); //.setMotor(Motor.builder().motor("Motocykl"));

        try (OutputStream outputStream = Files.newOutputStream(Path.of("ListaPojazdów.txt"));
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream))
            {
               objectOutputStream.writeObject(pojazd);


             } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
