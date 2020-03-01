package programowanieIO.day1602.Zad2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Napiszprogram ktory utworzy plik hello3.txt
 * Napisz w nim liczbe 15 (w trybie binarnym) oraz 11, a nastepnie otwirz plik txt
 *
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class Zad8 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = Files.newOutputStream(Path.of("hello3.txt"));
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);{

                dataOutputStream.writeChars("Hello");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
