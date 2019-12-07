package zadanie1;

public class Horse extends Animal implements AnimalInterface {

    public Horse(String name, int age, Sex sex, Human owner) {
        super(name, age, sex, owner);
    }



    @Override
    public String getVoice() {
        return "IHAAAA";
    }

    @Override
    public int getAge() {
        return super.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getSexName(){
        if(super.getSex()== Sex.MALE){
            return "Ogier";
        }else if(super.getSex()== Sex.FEMALE){
            return "Suka";
        }else{
            return"Wałach";
        }
    }


    @Override
    public String toString() {
        return "("+super.id+") Koń, "+this.getSexName()+" "+super.toString()+" "+getVoice();
    }
}
