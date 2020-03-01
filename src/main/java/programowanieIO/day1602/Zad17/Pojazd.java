package programowanieIO.day1602.Zad17;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 22.02.2020
 **/
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

class Motor {

    private String motor;
}
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
class Samochód {

    private String samochód;
}

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class Pojazd implements Serializable {

    private String NrRrejestracyjny;
    private int Pojemnosc_cc;
    private String Marka;
    private String Model;
    private int Cena;
    private Motor motor;
    private Samochód samochód;
}

  //  public  Pojazd setMotor(Motor.MotorBuilder motocykl, Samochód.SamochódBuilder samochód) {

    //}

