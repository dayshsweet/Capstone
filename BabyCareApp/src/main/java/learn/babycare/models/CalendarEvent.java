package learn.babycare.models;

import java.time.LocalDateTime;

public class CalendarEvent {
    private int calendarEventId;
    private User user;
    private Baby baby;
    private String typeOfCalendarEvent;
    private String description;
    private LocalDateTime time;

    public CalendarEvent(int calendarEventId, User user, Baby baby, String typeOfCalendarEvent, String description, LocalDateTime time) {
        this.calendarEventId = calendarEventId;
        this.user = user;
        this.baby = baby;
        this.typeOfCalendarEvent = typeOfCalendarEvent;
        this.description = description;
        this.time = time;
    }

    public CalendarEvent() {

    }

    public int getCalendarEventId() {
        return calendarEventId;
    }

    public void setCalendarEventId(int calendarEventId) {
        this.calendarEventId = calendarEventId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    public String getTypeOfCalendarEvent() {
        return typeOfCalendarEvent;
    }

    public void setTypeOfCalendarEvent(String typeOfCalendarEvent) {
        this.typeOfCalendarEvent = typeOfCalendarEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}

