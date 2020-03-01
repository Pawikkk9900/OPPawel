package programowanieIO.day1602;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *Chodzenie po folderach
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class Ex10Chodzenie {
    public static void main(String[] args) {
        try {
            Files.walk(Path.of("src"))
                    .filter(e -> Files.isRegularFile(e))
                    .filter(e -> e.toString().contains("Ex"))
                    .forEach(e -> {
                        System.out.println(e);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
