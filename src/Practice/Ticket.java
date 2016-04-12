/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author alancerio18
 */
public class Ticket {
    private String GarageName;
    private static int counter;
    private int ticketId;
    public Ticket(String GarageName) {
        this.GarageName = GarageName;
        counter++;
        ticketId = counter;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.ticketId;
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
        final Ticket other = (Ticket) obj;
        if (this.ticketId != other.ticketId) {
            return false;
        }
        return true;
    }
    
  

    
    public String getGarageName() {
        return GarageName;
    }

    public void setGarageName(String GarageName) {
        this.GarageName = GarageName;
    }
    
    
}
