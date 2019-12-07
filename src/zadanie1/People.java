package zadanie1;

import java.util.LinkedList;
import java.util.List;

public class People {
    private List<Person> people;
    private int id;

    public People() {
        this.people = new LinkedList<>();
    }

    public void add(Person person){
        this.people.add(person);
        person.setId(people.size());
    }

    public List<Person> getPeople() {
        return this.people;
    }
}
