package learn.babycare.data;

import learn.babycare.models.CareLog;

import java.util.List;

public interface CareLogRepository {

    List<CareLog> findAll();

    CareLog findById(int id);

    CareLog add(CareLog careLog);

    CareLog update(CareLog careLog);

    boolean delete(int id);
}
