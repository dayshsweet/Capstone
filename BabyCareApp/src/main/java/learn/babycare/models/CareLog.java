package learn.babycare.models;

import java.time.LocalTime;
import java.util.Objects;

public class CareLog {
    private int careLogId;
    private Baby baby;
    private User user;
    private CareTypes careType;
    private String careDetails;
    private LocalTime careTime;

    public CareLog(int careLogId, Baby baby, User user, CareTypes careType, String careDetails, LocalTime careTime) {
        this.careLogId = careLogId;
        this.baby = baby;
        this.user = user;
        this.careType = careType;
        this.careDetails = careDetails;
        this.careTime = careTime;
    }

    public CareLog() {

    }

    public int getCareLogId() {
        return careLogId;
    }

    public void setCareLogId(int careLogId) {
        this.careLogId = careLogId;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CareTypes getCareType() {
        return careType;
    }

    public void setCareType(CareTypes careType) {
        this.careType = careType;
    }

    public String getCareDetails() {
        return careDetails;
    }

    public void setCareDetails(String careDetails) {
        this.careDetails = careDetails;
    }

    public LocalTime getCareTime() {
        return careTime;
    }

    public void setCareTime(LocalTime careTime) {
        this.careTime = careTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CareLog careLog = (CareLog) o;
        return getCareLogId() == careLog.getCareLogId() && Objects.equals(getBaby(), careLog.getBaby()) && Objects.equals(getUser(), careLog.getUser()) && getCareType() == careLog.getCareType() && Objects.equals(getCareDetails(), careLog.getCareDetails()) && Objects.equals(getCareTime(), careLog.getCareTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCareLogId(), getBaby(), getUser(), getCareType(), getCareDetails(), getCareTime());
    }


}
