package streams.day0103;

import java.util.Optional;


/**
 * Zwroc odwrotnosci liczby d.
 *
 * @author oppawell@gmail.com
 * @since 01.03.2020
 **/
public class Zad1 {
    public static void main(String[] args) {
        Optional<Double> reserves = reserves(3);
        reserves.ifPresentOrElse(e -> System.out.println(e), () -> System.out.println("UPS"));

        Optional<Double> sqrt = sqrt(25);
        sqrt.ifPresent(e -> System.out.println(sqrt));

        // .map
        //Optional<5>
        //Optional<Optional><0.2>

        //.flatMap
        //Optional<5>
        //Optional<0.2>
        sqrt(25.0).map(e -> reserves(e))
                .ifPresent(e -> System.out.println(e));

        Optional<Double> sqrt1 = sqrt(25.0);
        if (sqrt1.isPresent()) {
            Double aDouble = sqrt1.get();
            Optional<Double> reverse = reserves(aDouble);
            reverse.ifPresent(e -> System.out.println(e));
        }
    }

    public static Optional<Double> reserves(double d) {
        if (d == 0) {
            return Optional.empty();
        } else {
            return Optional.of(1 / d);
        }
    }

    public static Optional<Double> sqrt(double d) {
        if (d == 0) {
            return Optional.empty();
        } else {
            return Optional.ofNullable(Math.sqrt(d));
        }
    }
}