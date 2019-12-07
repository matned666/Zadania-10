package zadanie1;

import java.util.LinkedList;
import java.util.List;

public class Animals {
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
}