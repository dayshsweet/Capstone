package learn.babycare.data.mappers;

import learn.babycare.models.Post;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostMapper implements RowMapper<Post> {

    @Override
    public Post mapRow(ResultSet rs, int rowNum) throws SQLException {

        Post post = new Post();

//        post.setPostId(rs.getInt("post_id"));
//        post.setTitle(rs.getString("title"));
//        post.setContent(rs.getString("content"));
//        post.setTimeCreated(rs.getTimestamp("created_at").toLocalDateTime());
//
//        JournalEntryMapper.makeUser(rs);
//
//        post.setUser(user);

        return post;
    }

}
