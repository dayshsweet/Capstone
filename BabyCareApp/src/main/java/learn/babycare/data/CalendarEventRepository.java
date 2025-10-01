package learn.babycare.data;

import learn.babycare.models.CalendarEvent;

import java.util.List;

public interface CalendarEventRepository {

    List<CalendarEvent> findAll();

    CalendarEvent findById(int id);

    CalendarEvent add(CalendarEvent calendarEvent);

    CalendarEvent update(CalendarEvent calendarEvent);

    boolean delete(int id);
}
