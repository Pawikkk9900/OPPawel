package lambda.day2302.Zad7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class ListaPracownikow {

    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Anna", 15);
        Pracownik pracownik2 = new Pracownik("Jan", 14);
        Pracownik pracownik3 = new Pracownik("Magda", 28);
        Pracownik pracownik4 = new Pracownik("Robert", 19);

        List<Pracownik> tab = Arrays.asList(pracownik4, pracownik2, pracownik, pracownik3);

        Collections.sort(tab);
        System.out.println(tab);

        Collections.sort(tab, new NameLenght());
        System.out.println(tab);

        Collections.sort(tab, new PracownikAgeComparator());
        System.out.println(tab);

    }
}
