package zadanie1;

public class BussinessPerson extends Human {


    public BussinessPerson(String name, String surname, Pesel pesel,String NIP) {
        super(name, surname, pesel, NIP);
    }

    @Override
    public String toString() {
            return +super.getId()+
                    ". Biznesowy - "+super.toString() + ", NIP: "+super.NIP;
    }

}
