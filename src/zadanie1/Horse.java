package zadanie1;

public class Horse implements Animal{

    private int id;
    private int age;
    private String name;

    public Horse(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getVoice() {
        return "IHAAAA";
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
        return "\n"+id+". Koń, nazywa się "+this.name+", ma "+this.age+" lat i robi "+getVoice();
    }
}
