package lambda.day2902.workalone;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 29.02.2020
 **/
public class Zad2Slack {
    public static void main(String[] args) {
        Runnable[] tasks = {
                ()-> System.out.println("Hello World!"),
                ()-> IntStream.rangeClosed(0,10).forEach(e -> System.out.println(e)),
                ()-> System.out.println("Motylem jestem aaaa!")
        };

        runInORder(tasks);
        runTogether(tasks);
    }

    private static void runTogether(Runnable[] tasks) {
   /*     for (int i = 0; i < tasks.length; i++) {
            Thread t = new Thread(tasks[i]);
            t.start();
        }*/

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < tasks.length; i++){
            executorService.submit(tasks[i]);
        }
    }

    private static void runInORder(Runnable[] tasks) {
        for (int i = 0; i <tasks.length; i++) {
            tasks[i].run();
        }
    }
}
