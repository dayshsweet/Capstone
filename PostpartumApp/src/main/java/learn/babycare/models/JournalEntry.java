package learn.babycare.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class JournalEntry {
    private int journalEntryId;
    private User user;
    private String text;
    private LocalDateTime timePosted;

    public JournalEntry(int journalEntryId, String text, LocalDateTime timePosted, User user) {
        this.journalEntryId = journalEntryId;
        this.user = user;
        this.text = text;
        this.timePosted = timePosted;
    }

    public JournalEntry() {

    }

    public int getJournalEntryId() {
        return journalEntryId;
    }

    public void setJournalEntryId(int journalEntryId) {
        this.journalEntryId = journalEntryId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimePosted() {
        return timePosted;
    }

    public void setTimePosted(LocalDateTime timePosted) {
        this.timePosted = timePosted;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        JournalEntry that = (JournalEntry) o;
        return getJournalEntryId() == that.getJournalEntryId() && Objects.equals(getUser(), that.getUser()) && Objects.equals(getText(), that.getText()) && Objects.equals(getTimePosted(), that.getTimePosted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJournalEntryId(), getUser(), getText(), getTimePosted());
    }
}
