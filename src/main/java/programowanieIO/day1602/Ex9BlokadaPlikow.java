package programowanieIO.day1602;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class Ex9BlokadaPlikow {
    public static void main(String[] args) {
        try (FileChannel fileChannel = FileChannel.open(Path.of("hello.txt"), StandardOpenOption.WRITE);) {
            fileChannel.lock();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}