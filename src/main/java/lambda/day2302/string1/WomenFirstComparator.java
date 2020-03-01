package lambda.day2302.string1;


import java.nio.charset.Charset;
import java.util.Comparator;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class WomenFirstComparator implements Comparator<String> {
    //o1 - Anna ->97
    //o2 - Vlad ->100

    //o1 - VLAD -> 100
    //o2 - Anna -> 97
    @Override
    public int compare(String o1, String o2) {
        char c1 = o1.charAt(o1.length() - 1);
        char c2 = o2.charAt(o2.length() - 1);
        return Character.toLowerCase(c1) - Character.toLowerCase(c2);
    }
}

   /*     if (c1 == 'a') {
            return -1;
        } else if (c2 == 'a') {
            return 1;
        } else {
            return 0;
        }
    }
}*/



