package zadanie1;

public class Dog extends Animal implements AnimalInterface {

    public Dog(String name, int age, Sex sex, Human owner) {

        super(name, age, sex, owner);
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



    public String getSexName(){
        if(super.getSex()== Sex.MALE){
            return "Pies";
        }else{
            return "Suka";
        }
    }


    @Override
    public String toString() {
        return super.id+". "+this.getSexName()+" "+super.toString()+" "+getVoice();
    }
}
