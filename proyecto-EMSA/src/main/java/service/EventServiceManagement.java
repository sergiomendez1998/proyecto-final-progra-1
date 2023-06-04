package service;

import interfaces.CrudInterface;
import repositories.EventRepository;
import model.Event;

import java.util.List;

public class EventServiceManagement implements CrudInterface {
    EventRepository eventDAO = new EventRepository();

    @Override
    public void create(Object object) {
        eventDAO.insertEvent((Event) object);
    }

    @Override
    public List<?> read() {
        return eventDAO.getAllEvents();
    }

    @Override
    public void update(Object object) {
          eventDAO.updateEvent((Event) object);
    }

    @Override
    public void delete(int id) {

    }
}
