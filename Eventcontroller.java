package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
 @Autowired
    private EventService eventService;

    @PostMapping
    public void createEvent(@RequestBody Event event) {
        eventService.saveEvent(event);
    }

    @GetMapping
    public List<Event> getEvents() {
        return eventService.getAllEvents();
    }
}