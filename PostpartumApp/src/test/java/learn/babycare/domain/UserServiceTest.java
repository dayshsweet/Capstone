package learn.babycare.domain;

import learn.babycare.data.UserJdbcClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class UserServiceTest {

    @MockitoBean
    UserJdbcClientRepository repository;

    @Autowired
    UserService service;

    @Test
    void findById() {
    }

    @Test
    void findByEmail() {
    }
}