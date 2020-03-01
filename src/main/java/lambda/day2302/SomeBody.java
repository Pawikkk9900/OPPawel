package lambda.day2302;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class SomeBody extends SomeBodyParent implements Person, Identified {
    @Override
    public String getName() {
        return "Hello World";
    }
    @Override
    public int getId() {
        return Identified.super.getId();
    }
}
