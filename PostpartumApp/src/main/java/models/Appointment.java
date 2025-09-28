package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Appointment {
    private int appointmentId;
    private User user;
    private Baby baby;
    private String typeOfAppointment;
    private String description;
    private LocalDateTime time;

    public Appointment(int appointmentId, User user, Baby baby, String typeOfAppointment, String description, LocalDateTime time) {
        this.appointmentId = appointmentId;
        this.user = user;
        this.baby = baby;
        this.typeOfAppointment = typeOfAppointment;
        this.description = description;
        this.time = time;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    public String getTypeOfAppointment() {
        return typeOfAppointment;
    }

    public void setTypeOfAppointment(String typeOfAppointment) {
        this.typeOfAppointment = typeOfAppointment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "baby=" + baby.getFirstName() +
                ", typeOfAppointment='" + typeOfAppointment + '\'' +
                ", description='" + description + '\'' +
                ", time=" + time +
                '}';
    }
}

