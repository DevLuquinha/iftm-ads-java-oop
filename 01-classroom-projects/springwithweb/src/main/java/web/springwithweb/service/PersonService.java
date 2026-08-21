package web.springwithweb.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.springwithweb.model.Person;
import web.springwithweb.repository.PersonRepository;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public long countTotalPeople() {
        return repository.count();
    }

    @Transactional
    public Person save(Person person) {
        return repository.save(person);
    }
}
