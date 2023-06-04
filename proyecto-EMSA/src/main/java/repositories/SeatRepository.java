package repositories;

import connection.ConnectionDBA;
import model.Seat;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SeatRepository {
    private final String SELECT_ALL_SEATS = "SELECT * FROM Seat";

    public List<Seat> getSelectAllSeats() {
        List<Seat> seats = new ArrayList<>();
        try (Connection connection = ConnectionDBA.getConnection()) {
            var preparedStatement = connection.prepareStatement(SELECT_ALL_SEATS);
            var resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Seat seat = new Seat();
                seat.setIdSeat(resultSet.getInt("id_seat"));
                seat.setRow(resultSet.getString("row"));
                seat.setNumber(resultSet.getString("number"));
                seats.add(seat);
            }
            preparedStatement.close();
            return seats;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
