package service;

import interfaces.CrudInterface;
import repositories.EventRepository;
import model.Event;

import java.util.List;

public class EventServiceManagement implements CrudInterface {
    EventRepository eventRepository = new EventRepository();

    @Override
    public void executeCreate(Object object) {
        eventRepository.insertEvent((Event) object);
    }

    @Override
    public List<?> executeReadAll() {
        return eventRepository.getAllEvents();
    }

    @Override
    public void executeUpdate(Object object) {
          eventRepository.updateEvent((Event) object);
    }

    @Override
    public void executeDelete(int id) {
      
    }

    @Override
    public void executeRead(int id) {
        
    }
}
