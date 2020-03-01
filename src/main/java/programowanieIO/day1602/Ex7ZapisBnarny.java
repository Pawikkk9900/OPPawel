package programowanieIO.day1602;

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
public class Ex7ZapisBnarny {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = Files.newOutputStream(Path.of("zapisbin.txt"));
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);{


                dataOutputStream.writeByte(100);
                dataOutputStream.writeByte(15);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
