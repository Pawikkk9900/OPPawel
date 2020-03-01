package programowanieIO.day1602.serializowane.Person;

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
public class PersonOdczyt {
    public static void main(String[] args) {
        try(InputStream inputStream = Files.newInputStream(Path.of("Person.ser"));
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            Person person = (Person) objectInputStream.readObject();
            String street =(String) objectInputStream.readObject();
            String ZipCode =(String) objectInputStream.readObject();
            person.setAddress(new Address(street, ZipCode));


            System.out.println(person);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
