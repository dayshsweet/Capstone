package learn.babycare.domain;

import learn.babycare.data.CalendarEventJdbcClientRepository;
import learn.babycare.models.CalendarEvent;
import learn.babycare.models.CalendarEvent;
import org.springframework.stereotype.Service;

@Service
public class CalendarEventService {

    private final CalendarEventJdbcClientRepository repository;

    public CalendarEventService(CalendarEventJdbcClientRepository repository) {
        this.repository = repository;
    }

    public CalendarEvent findById(int id) {
        return repository.findById(id);
    }
}
