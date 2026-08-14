package web.springwithweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.springwithweb.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
