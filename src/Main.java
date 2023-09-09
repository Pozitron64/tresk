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

