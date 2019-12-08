package zadanie1;

public abstract class Animal extends Instance implements AnimalInterface {


    private Human owner;

    public Animal(String name, int age, Sex sex, Human owner) {
        super(name, age, sex);
        this.owner = owner;

    }

    public Human getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return ", nazywa się "+this.name+", ma "+this.age+" lat i robi ";
    }

    @Override
    public String getVoice() {
        return null;
    }
}


