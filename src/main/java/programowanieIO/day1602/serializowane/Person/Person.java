package programowanieIO.day1602.serializowane.Person;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

class Address {
    private String street;
    private String ZipCode;
}

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data


public class Person implements Serializable {

    private String name;
    private String sucondName;
    private int age;
    private String pesel;
    private transient Address address;


}
