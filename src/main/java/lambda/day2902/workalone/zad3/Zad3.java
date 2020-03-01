package lambda.day2902.workalone.zad3;

import java.util.function.IntConsumer;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 29.02.2020
 **/
public class Zad3 {
    public static void main(String[] args) {
        repeat(5, (i) -> System.out.println("Hello" + i));
    }

    private static void repeat(int n, IntConsumer o) {  //IntConsumer zamiast Intexecutor
        for (int i = 0; i < n; i++){
            o.accept(i);   //accept zamiast execute
        }
    }
}
