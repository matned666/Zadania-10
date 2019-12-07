package zadanie1;

public abstract class Animal extends Instance {


    private Human owner;

    public Animal(String name, int age, Sex sex, Human owner) {
        super(name, age, sex);
        this.owner = owner;
    }

    @Override
    public String toString() {
        return ", nazywa się "+this.name+", ma "+this.age+" lat i robi ";
    }
}


