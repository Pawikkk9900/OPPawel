package regex.day2202;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 22.02.2020
 **/
public class Ex3Zadanie2 {
    private static List<String> correctPhones = new ArrayList<>();
    private static Pattern CORRECT_NUMBER_REGEX = Pattern.compile("^[0-9]{3} ?[0-9]{3} ?[0-9]{3}$");
    private static Pattern COMPANY_NUMBER_REGEX = Pattern.compile("[0-9 ]+370");
    private static Pattern HAPPY_NUMBER = Pattern.compile("[0-9]{3} ?[0-9]77 ?[0-9]77");
    private static Pattern BALANCED_NUMBER_REGEX = Pattern.compile("^[0-9]{3} ?([0-9]{3}) ?([0-9]{3})$");
    private static Pattern BYTE_NUMBER_REGEX = Pattern.compile("^([0-9]{2}[1248] ?){3}$");

    public static void main(String[] args) {
        readPhones();
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
    }

    private static void zad5() {
        long count = correctPhones.stream().filter(BYTE_NUMBER_REGEX.asPredicate()).count();
        System.out.println("Zad 5: Byte Number :" + count);
    }

    private static void zad4() {
        int count = 0;
        for (String s : correctPhones) {
            Matcher matcher = BALANCED_NUMBER_REGEX.matcher(s);
            while (matcher.find()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (sumOf(group) == sumOf(group2)) {
                    count++;
                }
            }
        }
        System.out.println("Zad 4: Balanced numbers: " + count);
    }

    private static long sumOf(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i));
        }
        return sum;
    }

    private static void zad3() {
        long count1 = correctPhones.stream().filter(HAPPY_NUMBER.asPredicate()).count();
        System.out.println("Zad 3: Happy Numbers : " + count1);
    }

    private static void zad2() {
        int count = 0;
        for (String s : correctPhones) {
            Matcher matcher = COMPANY_NUMBER_REGEX.matcher(s);
            if (matcher.matches()) {
                count++;
            }
        }
        System.out.println("Zad 2: Numery Firmowe :" + count);
    }

    private static void zad1() {
        int count = 0;
        for (String phone : correctPhones) {
            //czy numer jest poprawny
            count++;
        }
        System.out.println("Zad 1: Ilosc poprawnych numerow = " + count);
    }

    private static void readPhones() {
        //try(){}....
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("phone.txt"))) {
            //tylko poprawne
            //    bufferedReader.lines().forEach(nr -> {
           /*     if (CORRECT_NUMBER_REGEX.matcher(nr).matches())
                ///patern.matcher()
              */  //if correct
            correctPhones = bufferedReader.lines()
                    //.filter(nr->{ return CORRECT_NUMBER_REGEX.matcher(nr).matches();})  //dobrze ale mozna ladniej
                    .filter(CORRECT_NUMBER_REGEX.asPredicate()) // ladniej
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}