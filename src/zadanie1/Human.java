package zadanie1;

import java.util.List;

public abstract class Human extends Instance {


    public Human(String name, String surname, Pesel pesel, List<AnimalInterface> animalInterfaces) {
        super(name, surname, pesel, animalInterfaces);
    }

    public Human(String name, String surname, Pesel pesel) {
        super(name, surname, pesel);
    }

    public Human(int age, List<AnimalInterface> animalInterfaces, String name, String surname, Pesel pesel, Sex sex, String NIP) {
        super(age, animalInterfaces, name, surname, pesel, sex, NIP);
    }

    public Human(int age, String surname, Pesel pesel, Sex sex, String NIP) {
        super(age, surname, pesel, sex, NIP);
    }

    public String getSexName(){
        if(this.sex == Sex.MALE){
            return "Mężczyzna";
        }else{
            return "Kobieta";
        }
    }

    @Override
    public String toString() {

        return  "Imię: " + name  +
                ", Nazwisko: " + surname +
                ", Wiek: " + age+
                ", płeć: "+this.getSexName();

    }

}
