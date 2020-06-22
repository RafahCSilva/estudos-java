package rcs.rafahcsilva.Data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rcs.rafahcsilva.Data.models.Person;
import rcs.rafahcsilva.Data.repository.PersonRepository;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    @ResponseBody
    public List<Person> findAll() {
        return (List<Person>) this.personRepository.findAll();
    }

    @PostMapping
    @ResponseBody
    public Person create(@RequestBody Person person) {
        return this.personRepository.save(person);
    }

}
