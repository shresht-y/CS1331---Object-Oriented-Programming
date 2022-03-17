/**
 * Class that implements Plunderable.java.
 * Represents a ship.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Ship implements Plunderable {
    private Loot[] cargo;
    private double totalCargoValue;
    private String name;

    /**
     * Constructor for ship class with custom ship name.
     * @param name String representing the name of the Ship.
     */
    public Ship(String name) {
        this.name = name;
        this.cargo = new Loot[10];
        this.totalCargoValue = 0;
    }

    /**
     * Constructor for Ship class with default name "Black Pearl".
     */
    public Ship() {
        this("Black Pearl");
    }

    /**
     * Override for toString method that prints all the loot on a Ship, and totalValue.
     */
    @Override
    public String toString() { //TEST THIS
        String cargoNames = "";
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] != null) {
                cargoNames = cargoNames + cargo[i].toString() + ", ";
            }
        }
        String firstHalf = String.format("A ship called %s with cargo ", name);
        String endHalf = String.format("which has a total value of %.2f.\n", totalCargoValue);
        return firstHalf + cargoNames + endHalf;
    }

    /**
     * Adds the passed in cargo to the ship if there are empty spots in the array.
     * If array is full, doubles the size of cargo array and adds passed in Loot.
     * @param newItem Loot representing the cargo that must be added to the ship.
     */
    public void addCargo(Loot newItem) {
        boolean isFull = false;
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] == null) {
                isFull = false;
                cargo[i] = newItem;
                totalCargoValue += newItem.getValue();
                break;
            } else {
                isFull = true;
            }
        }
        if (isFull) {
            Loot[] replacementArray = new Loot[cargo.length * 2];
            for (int i = 0; i < cargo.length; i++) {
                replacementArray[i] = cargo[i];
            }
            cargo = replacementArray;
            addCargo(newItem);
        }
    }

    /**
     * Removes the first piece of cargo on the Ship.
     * @return Loot representing the piece of cargo that was removed.
     */
    public Loot removeCargo() {
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] != null) {
                totalCargoValue -= cargo[i].getValue();
                Loot output = cargo[i];
                cargo[i] = null;
                return output;
            }
        }
        return null;
    }

    /**
     * Removes the specified piece of cargo from the Ship.
     * @param cargoToRemove Loot that the user wants removed from Ship.
     * @return Loot representing the Loot removed from the ship.
     */
    public Loot removeCargo(Loot cargoToRemove) {
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] == null) {
                continue;
            } else if (cargo[i].equals(cargoToRemove)) {
                totalCargoValue -= cargoToRemove.getValue();
                Loot output = cargo[i];
                cargo[i] = null;
                return output;
            }
        }
        return null;
    }

    /**
     * implementation for Plunderable.java.
     * @return Loot[] representing all Loot items removed from Ship.
     */
    @Override
    public Loot[] bePlundered() {
        int size = 0;
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] != null) {
                size++;
            }
        }
        Loot[] output = new Loot[size];
        int counter = 0;
        for (int i = 0; i < cargo.length; i++) {
            if (cargo[i] != null) {
                totalCargoValue -= cargo[i].getValue();
                output[counter] = cargo[i];
                cargo[i] = null;
                counter++;
            }
        }
        return output;
    }
}
