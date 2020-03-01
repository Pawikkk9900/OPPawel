package regex.day2202;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 22.02.2020
 **/
public class Ex4Zad4 {
    private static List<String> data;
    private static Pattern WOMAN_REGEX = Pattern.compile("^.*a:.*");
    private static Pattern WOMAN_LUBICZ_REGEX = Pattern.compile("^.*a:Lubicz .*");
    private  static Pattern MAZOWIECKIE_REGEX = Pattern.compile("^.*[0-9]{1,2}-[0-9]{3} Mazowieckie .*$");
    private  static Pattern DOLNOSLASKIE_WP_PL = Pattern.compile("^.*[0-9]{1,2}-[0-9]{3} Dolnoslaskie .*wp.pl$", Pattern.UNICODE_CHARACTER_CLASS);
    private  static Pattern ZIP_CODE_00_X99 = Pattern.compile("^.* 00-[0-9]99 .*$", Pattern.UNICODE_CHARACTER_CLASS);
    private  static Pattern STATE_PATTERN = Pattern.compile("^.* [0-9]{1,2}-[0-9]{3} ([a-zA-Z-]+) .*$", Pattern.UNICODE_CHARACTER_CLASS);
    public static void main(String[] args) {
        readPersonList();
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();

    }

    private static void zad6() {
        Map<String, Long> stateAndCount = new HashMap<>();
        for (String linia : data){
            Matcher matcher = STATE_PATTERN.matcher(linia);
            while (matcher.find()){
                String woj = matcher.group(1);
                Long iloscOsobZWoj = stateAndCount.getOrDefault(woj , 0L);
                iloscOsobZWoj += 1;
                stateAndCount.put(woj, iloscOsobZWoj);
            }
        }
        // TODO wypisac tylko 3 z najwiesza liczba osob
        System.out.println(stateAndCount);
    }

    private static void zad5() {
        final long count = data.stream().filter(ZIP_CODE_00_X99.asPredicate()).count();
        System.out.println("Zad5: Kod Pocztowy 00-X99 :" + count);
    }

    private static void zad4() {
        final long count = data.stream().filter(DOLNOSLASKIE_WP_PL.asPredicate()).count();
        System.out.println("Zad4: Dolnoslaskie :" + count);
    }

    private static void zad3() {
        final long count = data.stream().filter(MAZOWIECKIE_REGEX.asPredicate()).count();
        System.out.println("Zad3: Mazoieckie :" + count);
    }

    private static void zad2() {
      final long count =  data.stream().filter(WOMAN_LUBICZ_REGEX.asPredicate()).count();
        System.out.println("Zad2: Kobiety Lubicz :" + count);
    }

    private static void zad1() {
        int count = 0;
        for (String s : data) {
            Matcher matcher = WOMAN_REGEX.matcher(s);
            if (matcher.matches()) {
                count++;
            }
        }
        System.out.println("Zad 1: Ilosc kobiet na liscie :" + count);
    }

    private static void readPersonList() {

        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("ListaOsob"))) {
            data = bufferedReader.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
