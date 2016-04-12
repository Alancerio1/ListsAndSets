package common;

import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Employee implements Comparable {

    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

//     Map map = new HashMap(); 
//     map.put("111-11-1111", e1);
//     map.put("111-11-1111", e2);
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
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

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee)o;

//        return new CompareToBuilder()
//               .append(this.empID, o.empID)
//               .toComparison();
        // NO Magic numbers! Use constants for readability!
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        Employee em = (Employee)o;

        if (this.equals(e)) {
            return EQUAL;
        }

//        if(this.empID > e.empID) return BEFORE;
//        if(this.empID < e.empID) return AFTER;
        // The String class already has a compareTo implementation, so
        // just use that.
        int comparison = this.ssn.compareTo(e.getSsn());
        if (comparison != EQUAL) {
            return comparison;
        }

        return EQUAL; // default
    }
}
