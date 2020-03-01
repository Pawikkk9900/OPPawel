package lambda.day2302;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/

interface Person {
    String getName();
    default int getId() {return -1;}
}
