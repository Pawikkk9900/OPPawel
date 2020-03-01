package programowanieIO.day1602.serializowane.osoba;

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
public class Osoba implements Serializable {
    private int age;
    private String pesel;
    private String name;
    private transient Dzial dzial;
}