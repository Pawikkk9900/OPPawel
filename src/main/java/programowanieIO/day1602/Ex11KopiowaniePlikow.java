package programowanieIO.day1602;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 16.02.2020
 **/
public class Ex11KopiowaniePlikow {
    public static void main(String[] args) throws IOException {
        //docelowy/a
        copyDir(Path.of("doskopiowania"), Path.of("docelowy"));
    }
    public static void copyDir(Path src, Path dst) throws IOException {
        // doskopiowania -> docelowy
        Files.walk(src).forEach(e -> {
            Path resolve = src.relativize(e); // jak z src dojsc do e
            Path polaczenie = dst.resolve(resolve); // polaczenie dst + outputu powyzej
            if(Files.isDirectory(e)){
                try {
                    Files.createDirectory(polaczenie);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                try {
                    Files.copy(e, polaczenie);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}