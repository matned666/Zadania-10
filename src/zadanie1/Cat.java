package zadanie1;

public class Cat implements Animal {

    private int id;
    private int age;
    private String name;



    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getVoice() {
        return "MIAUUU";
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
        return "\n"+id+". Kot, wabi się "+this.name+", ma "+this.age+" lat i robi "+getVoice();
    }
}

