// Generated with g9.

package com.crud.sql.dto;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="faculty")
public class Faculty implements Serializable {

    /** Primary key. */
    protected static final String PK = "code";

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
    @Column(unique=true, nullable=false)
    private int code;
    @Column(nullable=false, length=100)
    private String name;
    @OneToMany(mappedBy="faculty")
    private Set<Researcher> researcher;
    @OneToMany(mappedBy="faculty")
    private Set<Team> team;

    /** Default constructor. */
    public Faculty() {
        super();
    }

    /**
     * Access method for code.
     *
     * @return the current value of code
     */
    public int getCode() {
        return code;
    }

    /**
     * Setter method for code.
     *
     * @param aCode the new value for code
     */
    public void setCode(int aCode) {
        code = aCode;
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
     * Access method for researcher.
     *
     * @return the current value of researcher
     */
    public Set<Researcher> getResearcher() {
        return researcher;
    }

    /**
     * Setter method for researcher.
     *
     * @param aResearcher the new value for researcher
     */
    public void setResearcher(Set<Researcher> aResearcher) {
        researcher = aResearcher;
    }

    /**
     * Access method for team.
     *
     * @return the current value of team
     */
    public Set<Team> getTeam() {
        return team;
    }

    /**
     * Setter method for team.
     *
     * @param aTeam the new value for team
     */
    public void setTeam(Set<Team> aTeam) {
        team = aTeam;
    }

    /**
     * Compares the key for this instance with another Faculty.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Faculty and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Faculty)) {
            return false;
        }
        Faculty that = (Faculty) other;
        if (this.getCode() != that.getCode()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Faculty.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Faculty)) return false;
        return this.equalKeys(other) && ((Faculty)other).equalKeys(this);
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
        i = getCode();
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
        StringBuffer sb = new StringBuffer("[Faculty |");
        sb.append(" code=").append(getCode());
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
        ret.put("code", Integer.valueOf(getCode()));
        return ret;
    }

}
