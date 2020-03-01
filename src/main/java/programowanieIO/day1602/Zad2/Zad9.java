package programowanieIO.day1602.Zad2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class Zad9 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = Files.newOutputStream(Path.of("hello4.txt"));
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);{


                    dataOutputStream.write( 15);
                dataOutputStream.write(11);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

