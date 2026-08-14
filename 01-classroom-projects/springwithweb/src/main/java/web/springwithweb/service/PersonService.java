package web.springwithweb.service;

import org.springframework.stereotype.Service;

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
}
