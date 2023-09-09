import javax.print.DocFlavor;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    // условные конструкции, модификаторы доступа, исключения, разновидности строковых классов, пул строк, super,
    // принципы ООП, интерфейсы, абстрактные классы, дженерики, коллекции, работа с файлами, сериализация, многопоточность
    // лямбда выражения, Stream API, повторить group by, having, check, jdbc, JPA, Hibernate
    // повторить память, повторить методы строк
    public static void main(String[] args) throws IOException {
        /*Animal an = new Tigr();
        an.getName();*/
        Animal animal = new Animal() {
            @Override
            public String getName() {
                return "Tigr";
            }
        };
        /*System.out.println(animal.getName());
        Opperationable tre = () -> System.out.println("xew");*/
        //Stream.of(1,2,3).filter(x -> x>2).forEach(x -> System.out.println(x));
        Integer[] array = Stream.of(1, 2, 3, 4, 5, 6).toArray(g -> new Integer[g]);
    }
}

@FunctionalInterface
interface Opperationable{
    public void calculate();
    public static int Hello(){
        return 5;
    }
}
abstract class Animal {
    public abstract String getName();

}

