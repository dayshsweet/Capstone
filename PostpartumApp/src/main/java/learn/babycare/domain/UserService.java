package learn.babycare.domain;

import learn.babycare.data.UserRepository;
import learn.babycare.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findById(int id) {
        return repository.findById(id);
    }

    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

}
