package programowanieIO.day1602.serializowane.Person;

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
public class PersonZapis {
    public static void main(String[] args) {

        Person person = Person.builder().name("Paweł").sucondName("Maniecki").age(24).pesel("124124141").address(Address.builder().street("Na Uboczu").ZipCode("02-111").build()).build();

        try (OutputStream outputStream = Files.newOutputStream(Path.of("Person.ser"));
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream))
        {
            objectOutputStream.writeObject(person);
            objectOutputStream.writeObject(person.getAddress().getStreet());
            objectOutputStream.writeObject(person.getAddress().getZipCode());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
