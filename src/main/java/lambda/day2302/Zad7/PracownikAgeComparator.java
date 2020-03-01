package lambda.day2302.Zad7;

import java.util.Comparator;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class PracownikAgeComparator implements Comparator<Pracownik> {
    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        //o1 - Anna -> 14
        //o2 - Vlad -> 28
        //Anna przed Vlad -> (-) => 14 - 28 = -14 V

        //o1 - Vlad -> 28
        //o2 - Anna -> 14
        //Anna przed Vlad -> (+) => 28 - 14 = 14
        return o1.getAge() - o2.getAge();
    }
}