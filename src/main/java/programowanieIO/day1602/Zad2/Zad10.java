package programowanieIO.day1602.Zad2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Wstawianie liczby do natatnika pomiedzy juz istniejacy ciag liczb
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class Zad10 {
    public static void main(String[] args) {
        try (RandomAccessFile accessFile = new RandomAccessFile("hello4.txt", "rw");) {
            accessFile.seek(1);
            final byte b = accessFile.readByte();
            accessFile.seek(1);
            accessFile.writeByte(19);
            accessFile.writeByte(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
