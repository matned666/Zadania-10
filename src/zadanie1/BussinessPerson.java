package zadanie1;

import java.util.List;

public class BussinessPerson extends Human {


    public BussinessPerson(int age, List<AnimalInterface> animalInterfaces, String name, String surname, Pesel pesel, Sex sex, String NIP) {
        super(age, animalInterfaces, name, surname, pesel, sex, NIP);
    }

    public BussinessPerson(int age, String surname, Pesel pesel, Sex sex, String NIP) {
        super(age, surname, pesel, sex, NIP);
    }

    @Override
    public String toString() {
            return "("+super.getId()+
                    ") Biznesowy - "+super.toString() + ", NIP: "+super.NIP;
    }

}
