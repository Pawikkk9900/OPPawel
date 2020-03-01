package programowanieIO.day1502;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Ex6OdczytZnakowyBufforowany {
    public static void main(String[] args) {
        try(                                                                                             //InputStream inputStream = Files.newInputStream(Path.of("odczyt1.txt"));
              BufferedReader bufferedReader = Files.newBufferedReader(Path.of("hello.txt"))         //InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                                                                                                         //BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ){
            int r = bufferedReader.read();
            System.out.println((char) r);

        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}