package zadanie1;

public class BussinessPerson extends Person{

    private String NIP;

    public BussinessPerson(String name, String surname, Pesel pesel, String NIP) {
        super(name, surname, pesel);
        this.NIP = NIP;
    }

    @Override
    public String toString() {
            return "("+super.getId()+
                    ") Biznesowy - "+super.toString() + ", NIP: "+NIP;
    }

}
