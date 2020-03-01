package lambda.day2302;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class SomeBodyRunner {
    public static void main(String[] args) {
        SomeBody someBody = new SomeBody();
        SomeBodyParent someBodyParent =new SomeBodyParent();
        System.out.println("somebody.getId() = " + someBody.getId());
        System.out.println(someBodyParent.getId());
    }
}
