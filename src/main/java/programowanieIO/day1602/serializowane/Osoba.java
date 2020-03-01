package programowanieIO.day1602.serializowane;

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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Osoba implements Serializable {

    private int age;
    private  String name;
    private String pesel;

}
