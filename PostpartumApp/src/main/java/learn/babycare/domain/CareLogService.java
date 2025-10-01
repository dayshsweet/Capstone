package learn.babycare.domain;

import learn.babycare.data.CareLogJdbcClientRepository;
import learn.babycare.models.CareLog;
import org.springframework.stereotype.Service;

@Service
public class CareLogService {

    private final CareLogJdbcClientRepository repository;

    public CareLogService(CareLogJdbcClientRepository repository) {
        this.repository = repository;
    }

    public CareLog findById(int id) {
        return repository.findById(id);
    }
}
