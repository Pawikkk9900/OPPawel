package lambda.day2302.Zad7;

import java.util.Comparator;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class NameLenght implements Comparator<Pracownik> {


    @Override
    public int compare(Pracownik pracownik, Pracownik pracownik2) {

        return pracownik.getName().length() - pracownik2.getName().length();
    }
}
