package learn.babycare.domain;

import learn.babycare.data.BabyJdbcClientRepository;
import learn.babycare.models.Baby;
import org.springframework.stereotype.Service;

@Service
public class BabyService {

    private final BabyJdbcClientRepository repository;

    public BabyService(BabyJdbcClientRepository repository) {
        this.repository = repository;
    }

    public Baby findById(int id) {
        return repository.findById(id);
    }
}
