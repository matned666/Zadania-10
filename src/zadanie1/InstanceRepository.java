package zadanie1;

import java.util.*;
import java.util.function.*;


public interface InstanceRepository<T> {
    List<T> getAll();
    List<T> findByAge(int age);
    Instance getPersonById(int id) ;
    AnimalInterface getAnimalById(int id);
    Optional<T> findById(int id);
    List<T> findByPredicate(Predicate<T> personPredicate);
    List<T> findAllOrderedBy(Comparator<T> order);
    List<Long> getAllIds();
    void foreach(Consumer<T> person);
}
