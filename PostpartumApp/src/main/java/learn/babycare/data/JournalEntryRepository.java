package learn.babycare.data;

import learn.babycare.models.JournalEntry;

import java.util.List;

public interface JournalEntryRepository {

    List<JournalEntry> findAll();

    JournalEntry findById(int id);

    JournalEntry add(JournalEntry journalEntry);

    JournalEntry update(JournalEntry journalEntry);

    boolean delete(int id);
}
