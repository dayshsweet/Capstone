package learn.babycare.data;

import learn.babycare.models.JournalEntry;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JournalEntryJdbcClientRepository implements JournalEntryRepository {

    private final JdbcClient jdbcClient;

    public JournalEntryJdbcClientRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public List<JournalEntry> findAll() {
        return List.of();
    }

    @Override
    public JournalEntry findById(int id) {
        return null;
    }

    @Override
    public JournalEntry add(JournalEntry journalEntry) {
        return null;
    }

    @Override
    public JournalEntry update(JournalEntry journalEntry) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
