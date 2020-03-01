package lambda.day2302.Zad2;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public interface IntSequence {
   int next();

   default boolean hasNext(){
       return true;}
}
