package learn.babycare.data.mappers;

import learn.babycare.models.JournalEntry;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JournalEntryMapper implements RowMapper<JournalEntry> {

    @Override
    public JournalEntry mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new JournalEntry(
                rs.getInt("journal_entry_id"),
                rs.getString("journal_entry_text"),
                rs.getTimestamp("time_posted").toLocalDateTime(),
                UserMapper.makeUser(rs)
        );

    }

}
