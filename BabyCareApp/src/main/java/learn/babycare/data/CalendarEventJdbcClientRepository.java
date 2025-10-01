package learn.babycare.data;

import learn.babycare.models.CalendarEvent;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CalendarEventJdbcClientRepository implements CalendarEventRepository {

    private final JdbcClient jdbcClient;


    public CalendarEventJdbcClientRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public List<CalendarEvent> findAll() {
        return List.of();
    }

    @Override
    public CalendarEvent findById(int id) {
        return null;
    }

    @Override
    public CalendarEvent add(CalendarEvent calendarEvent) {
        return null;
    }

    @Override
    public CalendarEvent update(CalendarEvent calendarEvent) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
