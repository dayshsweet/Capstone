package learn.babycare.data.mappers;

import learn.babycare.models.CalendarEvent;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CalendarEventMapper implements RowMapper<CalendarEvent> {

    @Override
    public CalendarEvent mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CalendarEvent(
                rs.getInt("calendar_event_id"),
                UserMapper.makeUser(rs),
                BabyMapper.makeBaby(rs),
                rs.getString("calendar_event_type"),
                rs.getString("description"),
                rs.getTimestamp("time").toLocalDateTime() // will edit later
        );
    }
}
