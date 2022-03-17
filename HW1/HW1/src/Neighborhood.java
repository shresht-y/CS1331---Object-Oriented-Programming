public class Neighborhood {
    private int numHouses;
    private House[] houses;

    Neighborhood(House[] houses) {
        setHouses(houses);
        setNumHouses(numHouses);
    }

    Neighborhood() {
        this(new House[5]);
    }

    public int getNumHouses() {
        return numHouses;
    }

    public House[] getHouses() {
        return houses;
    }

    private void setHouses(House[] houses) {
        this.houses = houses;
    }

    private void setNumHouses(int numHouses) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                numHouses++;
            }
        }
        this.numHouses = numHouses;
    }

    public void displayNewHouses(int year) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null && houses[i].getYearBuilt() >= year) {
                if (houses[i].getIsRenovated()) {
                    System.out.printf("House located at %s", houses[i].getAddress());
                    System.out.printf(" was built in %d ", houses[i].getYearBuilt());
                    System.out.printf("has %.1f number of bathrooms ", houses[i].getNumBaths());
                    System.out.printf("and has been renovated recently.\n");
                } else {
                    System.out.printf("House located at %s", houses[i].getAddress());
                    System.out.printf(" was built in %d ", houses[i].getYearBuilt());
                    System.out.printf("has %.1f number of bathrooms ", houses[i].getNumBaths());
                    System.out.printf("and has not been renovated recently.\n");
                }
            }
        }
    }

    public House addHouse(int index, House house) {
        for (int i = 0; i < houses.length; i++) {
            if (i == index && house != null) {
                if (houses[i] == null) {
                    houses[i] = house;
                    numHouses++;
                    return null;
                } else if (houses[i] != null) {
                    House returnHouse = houses[i];
                    houses[i] = house;
                    return returnHouse;
                }
            } else if (i == index && house == null) {
                return null;
            }
        }
        return null;
    }

    public House removeHouse(int index) {
        for (int i = 0; i < houses.length; i++) {
            if (i == index && houses[i] != null) {
                House returnHouse = houses[i];
                houses[i] = null;
                numHouses--;
                return returnHouse;
            } else if (i == index && houses[i] == null) {
                return null;
            }
        }
        return null;
    }

    public boolean isFull() {
        int counter = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                counter++;
            }
        }
        if (counter == houses.length) {
            return true;
        }
        return false;
    }

}
