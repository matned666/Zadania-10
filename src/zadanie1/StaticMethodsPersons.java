package zadanie1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class StaticMethodsPersons {

    public static void showPeople() {
        People people = new People();
        people.add(new PrivatePerson("Mateusz", "Niedbał", new Pesel("83090105394"), new LinkedList<Animal>(Arrays.asList(new Dog(1, "Didi"), new Dog(9, "Billy")))));
        people.add(new PrivatePerson("Sylwia", "Majer", new Pesel("86061506888"), new LinkedList<Animal>(Arrays.asList(new Dog(1, "Didi_2")))));
        people.add(new PrivatePerson("Jakub", "Rosowski", new Pesel("86103195393"), new LinkedList<Animal>(Arrays.asList(new Cat(14, "Łapek"), new Cat(6, "Łapka")))));
        people.add(new PrivatePerson("Jakub", "Maciaszek", new Pesel("8l120105t93"), new LinkedList<Animal>(Arrays.asList())));
        people.add(new PrivatePerson("Magdalena", "Grzesiak", new Pesel("82080115382"), new LinkedList<Animal>(Arrays.asList(new Horse(5, "Bufon")))));
        people.add(new PrivatePerson("Bartłomiej", "Lewandowski", new Pesel("89030204396"), new LinkedList<Animal>(Arrays.asList())));
        people.add(new BussinessPerson("Barbara", "Kot", new Pesel("80010906682"), "7830298371"));


        System.out.println("Wszyscy:");
        people.getPeople().stream()
                .forEach(System.out::println);
        System.out.println("\nStarsi niż 35 lat:");
        people.getPeople().stream()
                .filter(x -> x.getAge() > 35)
                .forEach(System.out::println);
        System.out.println("\nPosortowani wg. nazwiska:");
        people.getPeople().stream()
                .sorted(Comparator.comparing(x -> x.getSurname()))
                .forEach(System.out::println);
        System.out.println("\nSame kobiety:");
        people.getPeople().stream()
                .filter(x -> x.getPersonSex() == PersonSex.FEMALE)
                .forEach(System.out::println);
        System.out.print("\nIlość Mężczyzn: " +
                people.getPeople().stream()
                        .filter(x -> x.getPersonSex() == PersonSex.MALE)
                        .count());
        System.out.print(" Ilość Kobiet: " +
                people.getPeople().stream()
                        .filter(x -> x.getPersonSex() == PersonSex.FEMALE)
                        .count() + "\n");

        System.out.println();


    }

}
