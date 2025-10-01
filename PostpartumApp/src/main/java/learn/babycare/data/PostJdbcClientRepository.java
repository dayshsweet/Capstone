package learn.babycare.data;

import learn.babycare.models.Post;
import org.springframework.jdbc.core.simple.JdbcClient;

import java.util.List;

public class PostJdbcClientRepository implements PostRepository{

    private final JdbcClient jdbcClient;

    public PostJdbcClientRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public List<Post> findAll() {
        return List.of();
    }

    @Override
    public Post findById(int id) {
        return null;
    }

    @Override
    public Post add(Post post) {
        return null;
    }

    @Override
    public Post update(Post post) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
