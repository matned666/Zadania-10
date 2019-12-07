package zadanie1;

import java.util.List;

public class PrivatePerson extends Human {



    public PrivatePerson(String name, String surname, Pesel pesel, List<AnimalInterface> animalInterfaces) {
        super(name, surname, pesel, animalInterfaces);
    }


    @Override
    public String toString() {
        try {

            if (!getPesel().isValidPesel() || getPesel().getPesel().length() != 11) {
                throw new IncorrectPeselException();
            }
            return "("+super.getId()+
            ") Prywatny - "+super.toString() + ", PESEL: "+getPesel().getPesel()+super.getAnimalsList();

        }catch(IncorrectPeselException error){
                return "("+super.getId()+
                        ") Prywatny - "+super.toString() + ", PESEL: !!! NIEPRAWIDŁOWY PESEL !!!"+super.getAnimalsList();



        }
    }
}
