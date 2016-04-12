/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Objects;

/**
 *
 * @author alancerio18
 */
public class Person {
    private String fName;
    private String lName;
    private String SSN;

    public Person(String fName, String lName, String SSN) {
        this.fName = fName;
        this.lName = lName;
        this.SSN = SSN;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.SSN, other.SSN)) {
            return false;
        }
        return true;
    }

   public String toString(){
       return fName + " " + lName;
   }
    
    
//    public boolean equals(Object target){
//        if(target == null) return false;
//        Person p2 = (Person)target;
//        if(this.SSN.equals( p2.SSN)){
//            return true;
//        }else{
//            return false;
//        }
//    }
    
    
    public String getFname() {
        return fName;
    }

    public void setFname(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lName) {
        this.lName = lName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    
}
