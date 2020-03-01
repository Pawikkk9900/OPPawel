package streams.day0103;

import java.util.Optional;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 01.03.2020
 **/
public class OptionaleEx {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> ania = Optional.ofNullable(null);
//        ania.ifPresent(e -> System.out.println(e));
//        ania.ifPresentOrElse((e) -> System.out.println("Jest tutaj " + e), () -> System.out.println("Nie ma nic :("));
//        Optional<String> agnieszka = Optional.ofNullable("Aga");
//        agnieszka.map(e -> e.length()).ifPresent(e -> System.out.println(e));
        Optional<String> maja = Optional.ofNullable(null);
        System.out.println("maja.isPresent() = " + maja.isPresent());
//        maja.ifPresent(e -> System.out.println());
//        String maja2 = maja.get();
//        System.out.println(maja2);
/*        Optional<String> patryk = Optional.ofNullable("Patryk");
        String s = patryk.orElse("NIE MA :(");
        System.out.println(s);*/
//        Optional<String> patryk = Optional.ofNullable("Patryk");
//        patryk.orElseThrow(() -> new IllegalArgumentException());
    }
}