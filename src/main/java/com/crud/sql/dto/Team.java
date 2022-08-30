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

@Entity(name="team")
public class Team implements Serializable {

    /** Primary key. */
    protected static final String PK = "serialNumber";

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
    @Column(name="serial_number", unique=true, nullable=false, length=4)
    private String serialNumber;
    @Column(nullable=false, length=100)
    private String name;
    @OneToMany(mappedBy="team")
    private Set<Booking> booking;
    @ManyToOne(optional=false)
    @JoinColumn(name="faculty_code", nullable=false)
    private Faculty faculty;

    /** Default constructor. */
    public Team() {
        super();
    }

    /**
     * Access method for serialNumber.
     *
     * @return the current value of serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Setter method for serialNumber.
     *
     * @param aSerialNumber the new value for serialNumber
     */
    public void setSerialNumber(String aSerialNumber) {
        serialNumber = aSerialNumber;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
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
     * Compares the key for this instance with another Team.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Team and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Team)) {
            return false;
        }
        Team that = (Team) other;
        Object mySerialNumber = this.getSerialNumber();
        Object yourSerialNumber = that.getSerialNumber();
        if (mySerialNumber==null ? yourSerialNumber!=null : !mySerialNumber.equals(yourSerialNumber)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Team.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Team)) return false;
        return this.equalKeys(other) && ((Team)other).equalKeys(this);
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
        if (getSerialNumber() == null) {
            i = 0;
        } else {
            i = getSerialNumber().hashCode();
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
        StringBuffer sb = new StringBuffer("[Team |");
        sb.append(" serialNumber=").append(getSerialNumber());
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
        ret.put("serialNumber", getSerialNumber());
        return ret;
    }

}
