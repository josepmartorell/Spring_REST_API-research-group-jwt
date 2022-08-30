// Generated with g9.

package com.crud.sql.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="booking")
public class Booking implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    private LocalDateTime registeredAt;
    private LocalDate startAt;
    private LocalDate finalAt;
    @ManyToOne(optional=false)
    @JoinColumn(name="researcher_dni", nullable=false)
    private Researcher researcher;
    @ManyToOne(optional=false)
    @JoinColumn(name="team_serial_number", nullable=false)
    private Team team;

    /** Default constructor. */
    public Booking() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for registeredAt.
     *
     * @return the current value of registeredAt
     */
    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    /**
     * Setter method for registeredAt.
     *
     * @param aRegisteredAt the new value for registeredAt
     */
    public void setRegisteredAt(LocalDateTime aRegisteredAt) {
        registeredAt = aRegisteredAt;
    }

    /**
     * Access method for startAt.
     *
     * @return the current value of startAt
     */
    public LocalDate getStartAt() {
        return startAt;
    }

    /**
     * Setter method for startAt.
     *
     * @param aStartAt the new value for startAt
     */
    public void setStartAt(LocalDate aStartAt) {
        startAt = aStartAt;
    }

    /**
     * Access method for finalAt.
     *
     * @return the current value of finalAt
     */
    public LocalDate getFinalAt() {
        return finalAt;
    }

    /**
     * Setter method for finalAt.
     *
     * @param aFinalAt the new value for finalAt
     */
    public void setFinalAt(LocalDate aFinalAt) {
        finalAt = aFinalAt;
    }

    /**
     * Access method for researcher.
     *
     * @return the current value of researcher
     */
    public Researcher getResearcher() {
        return researcher;
    }

    /**
     * Setter method for researcher.
     *
     * @param aResearcher the new value for researcher
     */
    public void setResearcher(Researcher aResearcher) {
        researcher = aResearcher;
    }

    /**
     * Access method for team.
     *
     * @return the current value of team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * Setter method for team.
     *
     * @param aTeam the new value for team
     */
    public void setTeam(Team aTeam) {
        team = aTeam;
    }

    /**
     * Compares the key for this instance with another Booking.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Booking and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Booking)) {
            return false;
        }
        Booking that = (Booking) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Booking.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Booking)) return false;
        return this.equalKeys(other) && ((Booking)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Booking |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
