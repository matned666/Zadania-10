package zadanie1;

public class PrivatePerson extends Human {

    public PrivatePerson(String name, String surname, Pesel pesel) {
        super(name, surname, pesel);
    }

    @Override
    public String toString() {
        try {
            if (!getPesel().isValidPesel() || getPesel().getPesel().length() != 11) {
                throw new IncorrectPeselException();
            }
            return "("+super.getId()+
            ") Prywatny - "+super.toString() + ", PESEL: "+getPesel().getPesel();
        }catch(IncorrectPeselException error){
                return "("+super.getId()+
                        ") Prywatny - "+super.toString() + ", PESEL: !!! NIEPRAWIDŁOWY PESEL !!!";
        }
    }
}
