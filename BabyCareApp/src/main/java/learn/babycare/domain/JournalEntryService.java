package learn.babycare.domain;

import learn.babycare.data.JournalEntryJdbcClientRepository;
import learn.babycare.models.JournalEntry;
import org.springframework.stereotype.Service;

@Service
public class JournalEntryService {

    private final JournalEntryJdbcClientRepository repository;

    public JournalEntryService(JournalEntryJdbcClientRepository repository) {
        this.repository = repository;
    }

    public JournalEntry findById(int id) {
        return repository.findById(id);
    }
}
