package programowanieIO.day1502.Zad1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Zad3 {
    public static void main(String[] args) {
        try(InputStream inputStream = Files.newInputStream(Path.of("hello.txt"));
         Scanner scanner = new Scanner(inputStream);
        ){
            int i = scanner.nextInt();
            String s = scanner.nextLine();
            System.out.println(i);
            System.out.print(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
