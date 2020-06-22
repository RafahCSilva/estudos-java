package rcs.rafahcsilva.Data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import rcs.rafahcsilva.Data.models.Event;
import rcs.rafahcsilva.Data.models.Person;
import rcs.rafahcsilva.Data.repository.EventRepository;
import rcs.rafahcsilva.Data.repository.PersonRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/events/{eventId}/people")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private EventRepository eventRepository;

    public PersonController(PersonRepository personRepository, EventRepository eventRepository) {
        this.personRepository = personRepository;
        this.eventRepository = eventRepository;
    }

    @GetMapping
    @ResponseBody
    public Page<Person> findAll(@PathVariable("eventId") Long eventId, Pageable pageable) {
        // people direta
        // return (List<Person>) this.personRepository.findAll();

        // by Event
        Optional<Event> event = this.eventRepository.findById(eventId);
        if (!event.isPresent()) {
            return null;
        }

        // cast
        // return (List<Person>) event.get().getPeople();

        // cast from collection
        // return event.get().getPeople().stream().collect(Collectors.toList());

        // Pageable
        return this.personRepository.findByEventId(event.get(), pageable);
    }

    @PostMapping
    @ResponseBody
    public Person create(@PathVariable("eventId") Long eventId, @RequestBody Person person) {
        Optional<Event> event = this.eventRepository.findById(eventId);
        if (!event.isPresent()) {
            return null;
        }

        person.setEventId(event.get());
        return this.personRepository.save(person);
    }

}
