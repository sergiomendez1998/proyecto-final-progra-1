package interfaces;

import model.Event;

import java.util.List;

public interface CrudInterface<T> {

     void create(T object);

    public List<?> read();
    public void update(T object);
    public void delete(int id);
}
