public class House {
    private String address;
    private int yearBuilt; //cannot be negative
    private double numBaths;
    private boolean isRenovated;

    House(String address, int yearBuilt, double numBaths, boolean isRenovated) {
        setAddress(address);
        setYearBuilt(yearBuilt);
        setNumBaths(numBaths);
        setIsRenovated(isRenovated);
    }

    House(String address, double numBaths) {
        this(address, 1984, numBaths, false);
    }

    House() {
        this("North Ave NW, Atlanta, GA 30332", 1984, 1.0, false);
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    private void setYearBuilt(int yearBuilt) {
        if (yearBuilt >= 0) {
            this.yearBuilt = yearBuilt;
        }
    }

    public double getNumBaths() {
        return numBaths;
    }

    private void setNumBaths(double numBaths) {
        if (numBaths >= 0 && numBaths % 2 == 0) {
            this.numBaths = numBaths;
        }
    }

    public boolean getIsRenovated() {
        return isRenovated;
    }

    private void setIsRenovated(boolean isRenovated) {
        this.isRenovated = isRenovated;
    }
}
