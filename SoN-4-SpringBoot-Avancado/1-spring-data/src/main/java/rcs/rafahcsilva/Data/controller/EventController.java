package rcs.rafahcsilva.Data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import rcs.rafahcsilva.Data.models.Event;
import rcs.rafahcsilva.Data.repository.EventRepository;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping
    @ResponseBody
    public Page<Event> findAll(Pageable pageable) {
        return (Page<Event>) this.eventRepository.findAll(pageable);
    }

    @PostMapping
    @ResponseBody
    public Event create(@RequestBody Event event) {
        return this.eventRepository.save(event);
    }
}
