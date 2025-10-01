package learn.babycare.models;

import java.time.LocalDate;
import java.util.Objects;

public class Baby {
    private int babyId;
    private String name;
    private LocalDate birthDate;
    private String gender;
    private User user;

    public Baby(int babyId, String name, LocalDate birthDate, String gender, User user) {
        this.babyId = babyId;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.user = user;
    }

    public Baby() {

    }

    public int getBabyId() {
        return babyId;
    }

    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Baby baby = (Baby) o;
        return getBabyId() == baby.getBabyId() && Objects.equals(getName(), baby.getName()) && Objects.equals(getBirthDate(), baby.getBirthDate()) && Objects.equals(getGender(), baby.getGender()) && Objects.equals(getUser(), baby.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBabyId(), getName(), getBirthDate(), getGender(), getUser());
    }
}
