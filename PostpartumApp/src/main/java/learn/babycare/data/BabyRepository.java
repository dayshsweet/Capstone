package learn.babycare.data;

import learn.babycare.models.Baby;

import java.util.List;

public interface BabyRepository {

    List<Baby> findAll();

    Baby findById(int id);

    Baby add(Baby baby);

    Baby update(Baby baby);

    boolean delete(int id);
}
