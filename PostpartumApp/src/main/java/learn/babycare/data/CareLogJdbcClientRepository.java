package learn.babycare.data;

import learn.babycare.data.mappers.CareLogMapper;
import learn.babycare.models.CareLog;

import org.springframework.jdbc.core.simple.JdbcClient;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CareLogJdbcClientRepository implements CareLogRepository {

    private final JdbcClient jdbcClient;

    public CareLogJdbcClientRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public List<CareLog> findAll(){
        final String sql = "select log_id,baby_id, user_id, type, details, timestamp "
                + "from BabyCareLogs ;";

        return jdbcClient.sql(sql)
                .query(new CareLogMapper()).list();
    }

    @Override
    @Transactional
    public CareLog findById(int id) {
        final String sql = "select log_id,baby_id, user_id, type, details, timestamp "
                + "from BabyCareLogs "
                + "where log_id = ?;";

        return jdbcClient.sql(sql)
                .param(id)
                .query(new CareLogMapper())
                .optional().orElse(null);
    }

    @Override
    public CareLog add(CareLog careLog) {
        return null;
    }

    @Override
    public CareLog update(CareLog careLog) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
