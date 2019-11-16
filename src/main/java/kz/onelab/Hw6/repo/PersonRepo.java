package kz.onelab.Hw6.repo;

import kz.onelab.Hw6.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Long> {
    Iterable<Person> findByName(String name);

    Iterable<Person> findByNameEndingWith(String ending);

    Iterable<Person> findByAgeBetween(int a , int b);

}