package zadanie1;

import java.time.LocalDate;
import java.util.*;

public abstract class Instance {


    protected int age;
    protected List<AnimalInterface> animalInterfaces;
    protected int id;
    protected String name;
    protected String surname;
    protected Pesel pesel;
    protected Sex sex;
    protected String NIP;

    public Instance(String name, int age, Sex sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Instance(int age, List<AnimalInterface> animalInterfaces, String name, String surname, Pesel pesel, Sex sex, String NIP) {
        this.age = age;
        this.animalInterfaces = animalInterfaces;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.sex = sex;
        this.NIP = NIP;
    }

    public Instance(int age, String surname, Pesel pesel, Sex sex, String NIP) {
        this.age = age;
        this.surname = surname;
        this.pesel = pesel;
        this.sex = sex;
        this.NIP = NIP;
    }

    public Instance(String name, String surname, Pesel pesel, List<AnimalInterface> animalInterfaces) {
            this.name = name;
            this.surname = surname;
            this.age = LocalDate.now().getYear()-(1900+pesel.getPeselArray(pesel.getPesel())[0]*10+pesel.getPeselArray(pesel.getPesel())[1]);
            this.pesel = pesel;
            if (pesel.getPeselArray(pesel.getPesel())[9]%2==0) {
                this.sex = Sex.FEMALE;
            }else{
                this.sex = Sex.MALE;
            }
            this.animalInterfaces = animalInterfaces;
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

    public List<AnimalInterface> getAnimalInterfaces() {
        return animalInterfaces;
    }

    protected String getAnimalsList(){
        String animals = "";
        if(this.animalInterfaces.size()>0) {
            for (AnimalInterface element : this.animalInterfaces) {
                animals += element.toString();
            }
            return animals+"\n";
        }else return "\nbrak zwierząt\n";
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


