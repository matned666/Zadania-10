package zadanie1;

import java.util.LinkedList;
import java.util.List;

public class People {
    private List<Human> people;

    public People() {
        this.people = new LinkedList<>();
    }

    public void add(Human human){
        this.people.add(human);
        human.setId(people.size());
    }

    public Human getHuman(int i){
        Human returnedHuman = new Human();
        for(Human el: people){
            if(i == el.id){
                returnedHuman = el;
                break;
            }else{
                returnedHuman = null;
            }
        }
        return returnedHuman;

    }

    public List<Human> getPeople() {
        return this.people;
    }
}
