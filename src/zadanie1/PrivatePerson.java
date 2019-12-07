package zadanie1;

import java.util.LinkedList;
import java.util.List;

public class PrivatePerson extends Person {

    private List<Animal> animals;
    private String spacer = "---------------------------------------------";

    public PrivatePerson(String name, String surname, Pesel pesel, List<Animal> animals) {
        super(name, surname, pesel);
        this.animals = animals;
        int animalcounter = 0;
        for (Animal element : this.animals) {
            animalcounter++;
            element.setId(animalcounter);
        }
    }


    public List<Animal> getAnimals() {
        return animals;
    }

    private String getAnimalsList(){
        String animals = "";
        if(this.animals.size()>0) {
            for (Animal element : this.animals) {
                animals += element.toString();
            }
            return animals+"\n";
        }else return "\nbrak zwierząt\n";
    }

    @Override
    public String toString() {
        try {

            if (!getPesel().isValidPesel() || getPesel().getPesel().length() != 11) {
                throw new IncorrectPeselException();
            }
            return "("+super.getId()+
            ") Prywatny - "+super.toString() + ", PESEL: "+getPesel().getPesel()+"\nPosiadane zwierzęta:"+getAnimalsList()+spacer+"\n";

        }catch(IncorrectPeselException error){
                return "("+super.getId()+
                        ") Prywatny - "+super.toString() + ", PESEL: !!! NIEPRAWIDŁOWY PESEL !!!\nPosiadane zwierzęta:"+getAnimalsList()+spacer+"\n";



        }
    }
}
