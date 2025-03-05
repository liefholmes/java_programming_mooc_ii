
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LicensePlate)) {
            return false;
        }
        LicensePlate other = (LicensePlate) object;
        if (this.liNumber.equals(other.liNumber) &&
                this.country.equals(other.country)) {
            return true;
        }
        return false;
    }
    
    public int hashCode() {
        return this.liNumber.hashCode() + this.country.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
