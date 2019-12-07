package zadanie1;

import java.util.LinkedList;
import java.util.List;

public class People {
    private List<Instance> people;
    private int id;

    public People() {
        this.people = new LinkedList<>();
    }

    public void add(Instance instance){
        this.people.add(instance);
        instance.setId(people.size());
    }

    public List<Instance> getPeople() {
        return this.people;
    }
}
