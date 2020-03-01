package lambda.day2302.lambdaZadUsun;

import lambda.day2302.Zad7.Pracownik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Usuwam nulle  listy.
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class PracownikLambdaRunner {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Anna", 15);
        Pracownik pracownik2 = new Pracownik("Jan", 14);
        Pracownik pracownik3 = new Pracownik("Magda", 28);
        Pracownik pracownik4 = new Pracownik("Robert", 19);

        List<Pracownik> tab = new ArrayList<>(Arrays.asList(pracownik4, pracownik2,null, pracownik,null, pracownik3,null));
        //for (int i =0; i<tab.toArray().length; i++){
            tab.removeIf(pracownik1 -> pracownik1 == null);
//            }
            System.out.println(tab);
        }
    }

