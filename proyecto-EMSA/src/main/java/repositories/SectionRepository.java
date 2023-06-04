package repositories;

import connection.ConnectionDBA;
import model.Seat;
import model.Section;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SectionRepository {
    private final String SELECT_ALL_SECTIONS = "SELECT * FROM Section";

    public List<Section> getAllSections() {
        List<Section> sectionList = new ArrayList<>();
        try (Connection connection = ConnectionDBA.getConnection()) {
            var preparedStatement = connection.prepareStatement(SELECT_ALL_SECTIONS);
            var resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Section section = new Section();
                section.setIdSection(resultSet.getInt("id_section"));
                section.setName(resultSet.getString("name"));
                section.setPrice(resultSet.getDouble("price"));
                section.setSide(resultSet.getString("side"));
                sectionList.add(section);
            }
            preparedStatement.close();
            return sectionList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
