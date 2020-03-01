package lambda.day2302.Zad7;

/**
 * ... comment class...
 *
 * @author oppawell@gmail.com
 * @since 23.02.2020
 **/
public class Pracownik implements Comparable<Pracownik> {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pracownik(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    @Override
    public int compareTo(Pracownik pracownik) {
  //       this.name;
  //      pracownik.name;
        return this.name.compareTo(pracownik.name);
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
