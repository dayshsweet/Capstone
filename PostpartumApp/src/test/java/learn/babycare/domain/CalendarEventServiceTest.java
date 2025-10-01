package learn.babycare.domain;

import learn.babycare.data.CalendarEventJdbcClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class CalendarEventServiceTest {

    @MockitoBean
    CalendarEventJdbcClientRepository repository;

    @Autowired
    CalendarEventService service;

    @Test
    void findById() {
    }
}