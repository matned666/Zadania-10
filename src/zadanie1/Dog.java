package zadanie1;

public class Dog implements Animal {

    private int id;
    private int age;
    private String name;



    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getVoice() {
        return "HAUHAUUUU";
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "\n"+id+". Pies, wabi się "+this.name+", ma "+this.age+" lat i robi "+getVoice();
    }
}
