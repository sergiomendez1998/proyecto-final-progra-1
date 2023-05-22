package com.mycompany.emsa.project.controller.service.DAO;

import com.mycompany.emsa.project.connection.ConnectionDBA;
import com.mycompany.emsa.project.controller.service.model.Event;
import com.mycompany.emsa.project.controller.service.model.User;
import com.mycompany.emsa.project.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventDAO {
    private final String SELECT_ALL_EVENTS = "SELECT * FROM Event";
    private final String INSERT_EVENT = "INSERT INTO Event (name,description,status,event_date,start_time,end_time) VALUES (?,?,?,?,?,?)";
    private final String UPDATE_EVENT = "UPDATE Event SET name =?,description =?,status =?,event_date =?,start_time =?,end_time =? WHERE id =?";



    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        try(Connection connection = ConnectionDBA.getConnection()){
            var preparedStatement = connection.prepareStatement(SELECT_ALL_EVENTS);
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
            var preparedStatement = connection.prepareStatement(INSERT_EVENT);
            executeSave(event, preparedStatement);
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEvent(Event event) {
        try(Connection connection = ConnectionDBA.getConnection()){
            var preparedStatement = connection.prepareStatement(UPDATE_EVENT);
            executeSave(event, preparedStatement);
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void executeSave(Event event, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, event.getName());
        preparedStatement.setString(2, event.getDescription());
        preparedStatement.setString(3, event.getStatus());
        preparedStatement.setDate(4, (Date) event.getEventDate());
        preparedStatement.setTime(5, event.getStartTime());
        preparedStatement.setTime(6, event.getEndTime());
        preparedStatement.setInt(7, event.getIdEvent());
        preparedStatement.executeUpdate();
    }


    private void getEventFromResultSet(ResultSet resultSet, Event event) throws SQLException {
        event.setIdEvent(resultSet.getInt("id"));
        event.setName(resultSet.getString("name"));
        event.setDescription(resultSet.getString("description"));
        event.setStatus(resultSet.getString("status"));
        event.setEventDate(resultSet.getDate("event_date"));
        event.setStartTime(resultSet.getTime("start_time"));
        event.setEndTime(resultSet.getTime("end_time"));
   }
}
