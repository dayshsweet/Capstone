package learn.babycare.data;

import learn.babycare.models.User;

public interface UserRepository {

    User findByEmail(String email);

    User findById(int id);

    User add(User user);

    User update(User user);

    boolean delete(int id);
}
