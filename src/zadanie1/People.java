package zadanie1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class People implements InstanceRepository {
    private List<Human> people;

    public People() {
        this.people = new LinkedList<>();
    }

    public void add(Human human){
        this.people.add(human);
        human.setId(people.size());
    }

    public Human getHuman(int i){
        Human returnedHuman = new Human();
        for(Human el: people){
            if(i == el.id){
                returnedHuman = el;
                break;
            }else{
                returnedHuman = null;
            }
        }
        return returnedHuman;

    }

    public List<Human> getPeople() {
        return this.people;
    }

    @Override
    public List getAll() {
        return people.stream().sorted(Comparator.comparing(x -> x.getId())).collect(Collectors.toList());
    }

    @Override
    public List findByAge(int age) {
        return people.stream().filter(x -> x.getAge() == age).collect(Collectors.toList());
    }

    @Override
    public Human getPersonById(int id) {
        return people.stream().filter(x -> x.getId() == id).findAny().get();
    }

    @Override
    public AnimalInterface getAnimalById(int id) {
        return null;
    }

    @Override
    public Optional findById(int id) {
        return people.stream().filter(x -> x.getId() == id).min(Comparator.comparing(x -> x.getId()));
    }

    @Override
    public List findByPredicate(Predicate personPredicate) {
        return (List) people.stream().filter(personPredicate).collect(Collectors.toList());
    }

    @Override
    public List findAllOrderedBy(Comparator order) {
        return (List) people.stream().sorted(order).collect(Collectors.toList());
    }

    @Override
    public List<Long> getAllIds() {
        return (List)people.stream().map(x-> x.getId()).collect(Collectors.toList());
    }

    @Override
    public void foreach(Consumer person) {

    }
}
