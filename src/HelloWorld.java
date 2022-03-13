import model.Dog;
import model.Person;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person mayur=new Person("Mayur","Valte", LocalDate.of(1999,11,9));
        Person komal=new Person("Komal","Salunke",LocalDate.of(2000,07,12));
        mayur.setSpouse(komal);

        Dog fido=new Dog("Fido",LocalDate.of(2015,11,12));
        fido.bark();
        mayur.setPet(fido);
        System.out.println(mayur);
    }
}

