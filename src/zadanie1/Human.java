package zadanie1;

public class Human extends Instance {

    public Human() {
    }

    public Human(String name, String surname, Pesel pesel) {
        super(name, surname, pesel);
    }

    public Human(String name, String surname, Pesel pesel, String NIP) {
        super(name, surname, pesel, NIP);
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
