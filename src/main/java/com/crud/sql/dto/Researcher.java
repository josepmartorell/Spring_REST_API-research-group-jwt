// Generated with g9.

package com.crud.sql.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="researcher")
public class Researcher implements Serializable {

    /** Primary key. */
    protected static final String PK = "dni";

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
    @Column(unique=true, nullable=false, length=9)
    private String dni;
    @Column(name="surname_name", nullable=false, length=255)
    private String surnameName;
    @OneToMany(mappedBy="researcher")
    private Set<Booking> booking;
    @ManyToOne(optional=false)
    @JoinColumn(name="faculty_code", nullable=false)
    private Faculty faculty;

    /** Default constructor. */
    public Researcher() {
        super();
    }

    /**
     * Access method for dni.
     *
     * @return the current value of dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter method for dni.
     *
     * @param aDni the new value for dni
     */
    public void setDni(String aDni) {
        dni = aDni;
    }

    /**
     * Access method for surnameName.
     *
     * @return the current value of surnameName
     */
    public String getSurnameName() {
        return surnameName;
    }

    /**
     * Setter method for surnameName.
     *
     * @param aSurnameName the new value for surnameName
     */
    public void setSurnameName(String aSurnameName) {
        surnameName = aSurnameName;
    }

    /**
     * Access method for booking.
     *
     * @return the current value of booking
     */
    public Set<Booking> getBooking() {
        return booking;
    }

    /**
     * Setter method for booking.
     *
     * @param aBooking the new value for booking
     */
    public void setBooking(Set<Booking> aBooking) {
        booking = aBooking;
    }

    /**
     * Access method for faculty.
     *
     * @return the current value of faculty
     */
    public Faculty getFaculty() {
        return faculty;
    }

    /**
     * Setter method for faculty.
     *
     * @param aFaculty the new value for faculty
     */
    public void setFaculty(Faculty aFaculty) {
        faculty = aFaculty;
    }

    /**
     * Compares the key for this instance with another Researcher.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Researcher and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Researcher)) {
            return false;
        }
        Researcher that = (Researcher) other;
        Object myDni = this.getDni();
        Object yourDni = that.getDni();
        if (myDni==null ? yourDni!=null : !myDni.equals(yourDni)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Researcher.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Researcher)) return false;
        return this.equalKeys(other) && ((Researcher)other).equalKeys(this);
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
        if (getDni() == null) {
            i = 0;
        } else {
            i = getDni().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[Researcher |");
        sb.append(" dni=").append(getDni());
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
        ret.put("dni", getDni());
        return ret;
    }

}
