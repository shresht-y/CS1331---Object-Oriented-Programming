/**
 * Class with different functions relating to money.
 *
 * @version 1.0
 * @author Shresht Yadav
 */
public class Money {
    /**
     * Counts the total amount of dollars in given array.
     * @param cents Array of values in cents.
     * @return double representing the amount of dollars.
     */
    public static double countTotal(int[] cents) {
        if (cents.length == 0 || cents == null) {
            return 0;
        } else if (cents.length == 1) {
            //double value = cents[0] * 0.01;
            return cents[0] / 100.0;
        } else {
            int[] newPossibleValues = new int[cents.length - 1];
            for (int i = 0; i < cents.length - 1; i++) {
                newPossibleValues[i] = cents[i + 1];
            }
            return cents[0] / 100.0 + countTotal(newPossibleValues);
        }
    }

    /**
     * Finds how much money a person has left to pay.
     * Returns a negative value if person has more money than needed.
     * @param moneyRequired double representing how much dollars needs to be paid.
     * @param cents array representing cents the user has.
     * @return double representing amount of money left over (negative) or needed.
     */
    public static double findDifference(double moneyRequired, int[] cents) {
        if (cents.length == 1) {
            double output = moneyRequired - cents[cents.length - 1] * 0.01;
            return Math.round(output * 100.0) / 100.0;
        } else {
            moneyRequired = moneyRequired -  cents[cents.length - 1] * 0.01;
            int[] newCents = new int[cents.length - 1];
            for (int i = 0; i < cents.length - 1; i++) {
                newCents[i] = cents[i];
            }
            return findDifference(moneyRequired, newCents);
        }
    }

    /**
     * Finds the minimum amount of coins needed to make the change given.
     * Uses quarters, dimes, nickels, and pennies.
     * @param change int representing change that needs to be made.
     * @return int representing the minimum amount of coins needed.
     */
    public static int makeChange(int change) {
        if (change >= 25) {
            return 1 + makeChange(change - 25);
        } else if (change >= 10) {
            return 1 + makeChange(change - 10);
        } else if (change >= 5) {
            return 1 + makeChange(change - 5);
        } else {
            return change;
        }
    }

    /**
     * Finds the minimum amount of coins needed to make the change.
     * Uses the possible values for coin values.
     * @param change int representing the change that needs to be made
     * @param possibleValues array representing the possible coin values for change.
     * @return int representing the amount of coins needed.
     */
    public static int makeChange(int change, int[] possibleValues) {
        if (possibleValues.length == 0 || possibleValues == null) {
            return 0;
        } else if (change >= possibleValues[0]) {
            return 1 + makeChange(change - possibleValues[0], possibleValues);
        } else {
            int[] newPossibleValues = new int[possibleValues.length - 1];
            for (int i = 0; i < possibleValues.length - 1; i++) {
                newPossibleValues[i] = possibleValues[i + 1];
            }
            return makeChange(change, newPossibleValues);
        }
    }
}
