/**
 * Concrete class Flight.
 * Extends Transportation.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Flight extends Transportation {
    private int connectors;

    /**
     * Constructor with all variables as parameters.
     * Checks to make sure all parameters are not null or empty;
     * @param company String representing the name of the transportation company.
     * @param id int representing the vehicle identification number.
     * @param departDate String representing the departure date.
     * @param departTime String representing the departure time.
     * @param arrivalTime String representing the arrival time.
     * @param connectors int representing the number of connecting flights.
     */
    public Flight(String company, int id, String departDate, String departTime, String arrivalTime, int connectors) {
        super(company, id, departDate, departTime, arrivalTime);
        if (connectors < 0) {
            throw new IllegalArgumentException();
        } else {
            this.connectors = connectors;
        }
    }

    /**
     * Override of Transportation toString method to print all variables.
     */
    @Override
    public String toString() {
        return "Flight," + super.toString() + "," + connectors;
    }

    /**
     * Override for equals method in Transportation.
     * Two Flights are the same if all variables are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Flight f = (Flight) o;
            return this.connectors == f.connectors;
        } else {
            return false;
        }
    }
}
