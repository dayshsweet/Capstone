package learn.babycare.data;

import learn.babycare.data.mappers.BabyMapper;
import learn.babycare.data.mappers.UserMapper;
import learn.babycare.models.Baby;
import learn.babycare.models.User;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BabyJdbcClientRepository  implements BabyRepository{

    private final JdbcClient jdbcClient;

    public BabyJdbcClientRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public List<Baby> findAll(){
        final String sql = "select baby_id, user_id, name, gender, birth_date "
            + "from Babies ;";

        return jdbcClient.sql(sql)
                .query(new BabyMapper()).list();
    }

    @Override
    @Transactional
    public Baby findById(int id) {
        final String sql = "select baby_id, user_id, name, gender, birth_date "
                + "from Babies "
                + "where baby_id = ?;";

        return jdbcClient.sql(sql)
                .param(id)
                .query(new BabyMapper())
                .optional().orElse(null);
    }

    @Override
    public Baby add(Baby baby) {
        return null;
    }

    @Override
    public Baby update(Baby baby) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
