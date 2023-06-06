package repositories;

import connection.ConnectionDBA;
import model.Event;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventRepository {
    
    private PreparedStatement preparedStatement = null;
    private final String SELECT_ALL_EVENTS = "SELECT * FROM Events";
    private final String INSERT_EVENT = "INSERT INTO Events (name,description,status,event_date,start_time,end_time) VALUES (?,?,?,?,?,?)";
    private final String UPDATE_EVENT = "UPDATE Events SET name =?,description =?,status =?,event_date =?,start_time =?,end_time =?  WHERE id_event=?";



    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        try(Connection connection = ConnectionDBA.getConnection()){
            preparedStatement = connection.prepareStatement(SELECT_ALL_EVENTS);
            var resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Event event = new Event();
                getEventFromResultSet(resultSet, event);
                events.add(event);
            }
            preparedStatement.close();
            return events;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertEvent(Event event) {
        try(Connection connection = ConnectionDBA.getConnection()){
            preparedStatement = connection.prepareStatement(INSERT_EVENT);
            executeSave(event, preparedStatement,false);
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEvent(Event event) {
        try(Connection connection = ConnectionDBA.getConnection()){
            preparedStatement = connection.prepareStatement(UPDATE_EVENT);
            executeSave(event, preparedStatement,true);
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void executeSave(Event event, PreparedStatement preparedStatement, boolean isIDRequired) throws SQLException {
        preparedStatement.setString(1, event.getName());
        preparedStatement.setString(2, event.getDescription());
        preparedStatement.setString(3, event.getStatus());
        preparedStatement.setDate(4, event.getEventDate());
        preparedStatement.setTime(5, event.getStartTime());
        preparedStatement.setTime(6, event.getEndTime());
        if (isIDRequired) {
            preparedStatement.setInt(7, event.getIdEvent());
        }

        preparedStatement.executeUpdate();
    }


    private void getEventFromResultSet(ResultSet resultSet, Event event) throws SQLException {
        event.setIdEvent(resultSet.getInt("id_event"));
        event.setName(resultSet.getString("name"));
        event.setDescription(resultSet.getString("description"));
        event.setStatus(resultSet.getString("status"));
        event.setEventDate(resultSet.getDate("event_date"));
        event.setStartTime(resultSet.getTime("start_time"));
        event.setEndTime(resultSet.getTime("end_time"));
   }
}
