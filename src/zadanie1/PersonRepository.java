package zadanie1;

import java.util.*;
import java.util.function.*;


public interface PersonRepository <T> {
    List<T> getAll();
    List<T> findByAge(int age);
    Person getPersonById(int id) ;
    Animal getAnimalById(int id);
    Optional<T> findById(int id);
    List<T> findByPredicate(Predicate<T> personPredicate);
    List<T> findAllOrderedBy(Comparator<T> order);
    List<Long> getAllIds();
    void foreach(Consumer<T> person);
}
