package programowanieIO.day1602.serializowane.osoba;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class OdczytOsoby {
    public static void main(String[] args) {
        try (
                InputStream inputStream = Files.newInputStream(Path.of("zapisanaOsobaNonSer.ser"));
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
            Osoba o = (Osoba) objectInputStream.readObject();
            String dzial = (String) objectInputStream.readObject();
            o.setDzial(new Dzial(dzial));
            System.out.println(o);
//            int i = objectInputStream.readInt();
//            System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}