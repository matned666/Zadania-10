package zadanie1;

import java.time.LocalDate;
import java.time.Year;

public abstract class Person {



    private int id;
    private String name;
    private String surname;
    private int age;
    private Pesel pesel;
    private PersonSex personSex;

    public Person(String name, String surname, Pesel pesel) {
            this.name = name;
            this.surname = surname;
            this.age = LocalDate.now().getYear()-(1900+pesel.getPeselArray(pesel.getPesel())[0]*10+pesel.getPeselArray(pesel.getPesel())[1]);
            this.pesel = pesel;
            if (pesel.getPeselArray(pesel.getPesel())[9]%2==0) {
                this.personSex =PersonSex.FEMALE;
            }else{
                this.personSex =PersonSex.MALE;
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

    public PersonSex getPersonSex() {
        return personSex;
    }

    private String getSex(){
        if(this.personSex == PersonSex.MALE){
            return "Mężczyzna";
        }else{
            return "Kobieta";
        }
    }



    @Override
    public String toString() {

            return  "Imię: " + name  +
                    ", Nazwisko: " + surname +
                    ", Wiek: " + age +
                    ", Płeć: " + getSex();

//        }catch(IncorrectPeselException err){


    }
}


