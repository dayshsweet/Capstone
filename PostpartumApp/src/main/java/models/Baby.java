package models;

import java.time.LocalDate;
import java.util.Objects;

public class Baby {
    private int babyId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;

    public Baby(int babyId, String firstName, String lastName, LocalDate birthDate, String gender) {
        this.babyId = babyId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getBabyId() {
        return babyId;
    }

    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Baby baby = (Baby) o;
        return getBabyId() == baby.getBabyId() && Objects.equals(getFirstName(), baby.getFirstName()) && Objects.equals(getLastName(), baby.getLastName()) && Objects.equals(getBirthDate(), baby.getBirthDate()) && Objects.equals(getGender(), baby.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBabyId(), getFirstName(), getLastName(), getBirthDate(), getGender());
    }

    @Override
    public String toString() {
        return "Baby{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                '}';
    }
}
