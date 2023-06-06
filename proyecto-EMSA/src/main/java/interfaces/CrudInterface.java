package interfaces;



import java.util.List;

public interface CrudInterface<T> {

     void executeCreate(T object);

    public List<?> executeReadAll();
    public void executeUpdate(T object);
    public void executeDelete(int id);
    public void executeRead(int id);
}
