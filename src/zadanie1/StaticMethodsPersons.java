package zadanie1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class StaticMethodsPersons <T> {



    public static void showPeople() {
        People people = new People();
        people.add(new PrivatePerson("Mateusz", "Niedbał", new Pesel("83090105394")));
        people.add(new PrivatePerson("Sylwia", "Majer", new Pesel("86061506888")));
        people.add(new PrivatePerson("Jakub", "Rosowski", new Pesel("86103195393")));
        people.add(new PrivatePerson("Jakub", "Maciaszek", new Pesel("8l120105t93")));
        people.add(new PrivatePerson("Magdalena", "Grzesiak", new Pesel("82080115382")));
        people.add(new PrivatePerson("Bartłomiej", "Lewandowski", new Pesel("89030204396")));
        people.add(new BussinessPerson("Barbara", "Kot", new Pesel("80010906682"), "7830298371"));

        Animals animals = new Animals();
        animals.add(new Dog("Pimpek", 12,Sex.MALE,people.getHuman(4)));
        animals.add(new Dog("Billy", 8,Sex.MALE,people.getHuman(1)));
        animals.add(new Horse("Dragon", 13,Sex.CASTRATED,people.getHuman(5)));
        animals.add(new Cat("Kicia", 2,Sex.FEMALE,people.getHuman(6)));
        animals.add(new Cat("Odyn", 16,Sex.MALE,people.getHuman(3)));
        animals.add(new Cat("Didi", 1,Sex.FEMALE,people.getHuman(2)));







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
                .filter(x -> x.getSex() ==Sex.FEMALE)
                .forEach(System.out::println);
        System.out.print("\nIlość Mężczyzn: " +
                people.getPeople().stream()
                        .filter(x -> x.getSex() == Sex.MALE)
                        .count());









    }

}
