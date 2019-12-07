package zadanie1;

import java.time.LocalDate;

public abstract class Instance {


    protected int age;
    protected int id;
    protected String name;
    protected String surname;
    protected Pesel pesel;
    protected Sex sex;
    protected String NIP;

    public Instance() {
    }

    public Instance(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }



    public Instance(String name, String surname, Pesel pesel, String NIP) {
        this.surname = surname;
        this.pesel = pesel;
        this.name = name;
        this.age = LocalDate.now().getYear()-(1900+pesel.getPeselArray(pesel.getPesel())[0]*10+pesel.getPeselArray(pesel.getPesel())[1]);
        this.NIP = NIP;
        if (pesel.getPeselArray(pesel.getPesel())[9]%2==0) {
            this.sex = Sex.FEMALE;
        }else{
            this.sex = Sex.MALE;
        }
    }




    public Instance(String name, String surname, Pesel pesel) {
        this.name = name;
        this.surname = surname;
        this.age = LocalDate.now().getYear()-(1900+pesel.getPeselArray(pesel.getPesel())[0]*10+pesel.getPeselArray(pesel.getPesel())[1]);
        this.pesel = pesel;
        if (pesel.getPeselArray(pesel.getPesel())[9]%2==0) {
            this.sex = Sex.FEMALE;
        }else{
            this.sex = Sex.MALE;
        }

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Pesel getPesel() {
        return pesel;
    }

    public Sex getSex() {
        return sex;
    }






}


