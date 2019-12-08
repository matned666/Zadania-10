package zadanie1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Animals implements InstanceRepository{
    private List<Animal> animals;

    public Animals() {
        this.animals = new LinkedList<>();
    }

    public void add(Animal animal){
        this.animals.add(animal);
        animal.setId(animals.size());
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    @Override
    public List getAll() {
        return animals.stream().sorted(Comparator.comparing(x -> x.getId())).collect(Collectors.toList());
    }

    @Override
    public List findByAge(int age) {
        return animals.stream().filter(x -> x.getAge() == age).collect(Collectors.toList());
    }

    @Override
    public Human getPersonById(int id) {
        return null;
    }

    @Override
    public Animal getAnimalById(int id) {
        return animals.stream().filter(x -> x.getId() == id).findAny().get();
    }

    @Override
    public Optional findById(int id) {
        return animals.stream().filter(x -> x.getId() == id).min(Comparator.comparing(x -> x.getId()));
    }

    @Override
    public List findByPredicate(Predicate personPredicate) {
        return (List) animals.stream().filter(personPredicate).collect(Collectors.toList());
    }

    @Override
    public List findAllOrderedBy(Comparator order) {
        return (List) animals.stream().sorted(order).collect(Collectors.toList());
    }

    @Override
    public List<Long> getAllIds() {
        return (List)animals.stream().map(x-> x.getId()).collect(Collectors.toList());
    }

    @Override
    public void foreach(Consumer person) {

    }
}
