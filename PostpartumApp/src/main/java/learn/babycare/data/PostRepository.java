package learn.babycare.data;

import learn.babycare.models.Post;

import java.util.List;

public interface PostRepository {

    List<Post> findAll();

    Post findById(int id);

    Post add(Post post);

    Post update(Post post);

    boolean delete(int id);

}
