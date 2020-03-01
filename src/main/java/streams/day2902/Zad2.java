package streams.day2902;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 100 randomowych liczb.
 *
 * @author oppawell@gmail.com
 * @since 01.03.2020
 **/
public class Zad2 {
    public static void main(String[] args) {
    List<Double> a = Stream.generate(()-> Math.random())
            .limit(100)
            .collect(Collectors.toList());

        System.out.println(a);
    }
}
