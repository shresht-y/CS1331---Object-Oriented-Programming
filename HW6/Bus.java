/**
 * Concrete class Bus.
 * Extends Transportation.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Bus extends Transportation {
    private int stops;

    /**
     * Constructor with all variables as parameters.
     * Checks to make sure all parameters are not null or empty;
     * @param company String representing the name of the transportation company.
     * @param id int representing the vehicle identification number.
     * @param departDate String representing the departure date.
     * @param departTime String representing the departure time.
     * @param arrivalTime String representing the arrival time.
     * @param stops int representing the number of stops.
     */
    public Bus(String company, int id, String departDate, String departTime, String arrivalTime, int stops) {
        super(company, id, departDate, departTime, arrivalTime);
        if (stops < 0) {
            throw new IllegalArgumentException();
        } else {
            this.stops = stops;
        }
    }

    /**
     * Override of Transportation toString method to print all variables.
     */
    @Override
    public String toString() {
        return "Bus," + super.toString() + "," + stops;
    }

    /**
     * Override for equals method in Transportation.
     * Two Flights are the same if all variables are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Bus b = (Bus) o;
            return this.stops == b.stops;
        } else {
            return false;
        }
    }
}
