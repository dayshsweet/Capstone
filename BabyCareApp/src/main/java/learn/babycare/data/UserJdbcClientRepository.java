package learn.babycare.data;

import learn.babycare.data.mappers.UserMapper;
import learn.babycare.models.User;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserJdbcClientRepository implements UserRepository{
    private final JdbcClient jdbcClient;

    public UserJdbcClientRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    @Transactional
    public User findByEmail(String email) {
        final String sql = "select user_id, first_name, last_name, email, password "
                + "from Users "
                + "where email = ?;";

        return jdbcClient.sql(sql)
                .param(email)
                .query(new UserMapper())
                .optional().orElse(null);
    }

    @Override
    @Transactional
    public User findById(int id) {
        final String sql = "select user_id, first_name, last_name, email, password "
                + "from Users "
                + "where user_id = ?;";

        return jdbcClient.sql(sql)
                .param(id)
                .query(new UserMapper())
                .optional().orElse(null);
    }

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
