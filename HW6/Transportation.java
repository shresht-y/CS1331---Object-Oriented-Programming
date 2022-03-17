/**
 * Abstract class Transportation.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public abstract class Transportation {
    protected String company;
    protected int id;
    protected String departDate; //format MM-DD-YYYY
    protected String departTime; //format HHMM
    protected String arrivalTime; //format HHMM

    /**
     * Constructor with all variables as parameters.
     * Checks to make sure all parameters are not null or empty;
     * @param company String representing the name of the transportation company.
     * @param id int representing the vehicle identification number.
     * @param departDate String representing the departure date.
     * @param departTime String representing the departure time.
     * @param arrivalTime String representing the arrival time.
     */
    public Transportation(String company, int id, String departDate, String departTime, String arrivalTime) {
        if (company == null || company.length() == 0 || departDate == null || departDate.length() == 0
            || departTime == null || departTime.length() == 0 || arrivalTime == null
                || arrivalTime.length() == 0 || Integer.toString(id).length() != 5 || id < 0) {
            throw new IllegalArgumentException();
        } else {
            this.company = company;
            this.id = id;
            this.departDate = departDate;
            this.departTime = departTime;
            this.arrivalTime = arrivalTime;
        }
    }

    /**
     * Override for toString method to print all variables.
     */
    @Override
    public String toString() {
        return company + "," + id + "," + departDate + "," + departTime + "," + arrivalTime;
    }

    /**
     * Override for equals method.
     * Two Transportations are the same if all variables are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Transportation) {
            Transportation t = (Transportation) o;
            return this.company.equals(t.company) && this.id == t.id && this.departDate.equals(t.departDate)
                && this.departTime.equals(t.departTime) && this.arrivalTime.equals(t.arrivalTime);
        } else {
            return false;
        }
    }
}