package programowanieIO.day1502.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data // @Getter, @Setter, @EqualsAndHashCode, @ToString
@Builder
public class Person {
    private String name;
    private String surName;
    private int age;
    private String address;
    private String pesel;

}
