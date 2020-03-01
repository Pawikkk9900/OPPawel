package programowanieIO.day1502.Zad1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 15.02.2020
 **/
public class Zad1 {
    public static void main(String[] args) {
        try (InputStream inputStream = Files.newInputStream(Path.of("odczyt1.txt"));
             OutputStream outputStream = Files.newOutputStream(Path.of("zad1"))) {
            copy(inputStream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(InputStream in, OutputStream out) {
        try {
            byte[] tab = new byte[128];

            //in.read() -> tab
            //out.write(tab)
          //  in.read(tab);  // -> 50 (ilebajtow przeczytanych)
          //  out.write(tab);

            /*
            160 bytes
            1.  in.read(tab)  -> 128
                out.write(tab, 0, 128)
            2.  in.read(tab)   -> 32
                out.write(tab, 0, 32)
             */

            int read = 0;
            while ((read = in.read(tab)) != -1) {
                out.write(tab, 0 , read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


