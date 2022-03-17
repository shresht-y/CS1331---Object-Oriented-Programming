import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class representing a booking.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class Booking {
    /**
     * Scans through the file and constructs an arraylist of Transportation objects using information from the file.
     * @param fileName String representing the location of the file.
     * @return ArrayList of Transportation objects.
     * @throws InvalidBookingException Exception when a file entry is neither bus or flight.
     * @throws FileNotFoundException Exception if the file does not exist.
     */
    public static ArrayList<Transportation> outputBookings(String fileName) throws
        InvalidBookingException, FileNotFoundException {
        ArrayList<Transportation> output = new ArrayList<>();
        File file;
        if (fileName == null || fileName.length() == 0) {
            throw new FileNotFoundException("File not found");
        } else {
            file = new File(fileName);
        }
        if ((!(file.exists())) || file.length() == 0) {
            throw new FileNotFoundException("File not found");
        }
        Scanner s = new Scanner(file);
        while (s.hasNextLine()) {
            String stringedObject = s.nextLine();
            if (stringedObject.substring(0, stringedObject.indexOf(",")).equals("Flight")) {
                String[] splitVariables = stringedObject.split(",", 7);
                String company = splitVariables[1];
                int id = Integer.valueOf(splitVariables[2]);
                String departDate = splitVariables[3];
                String departTime = splitVariables[4];
                String arrivalTime = splitVariables[5];
                int connectors = Integer.valueOf(splitVariables[6]);
                Flight f = new Flight(company, id, departDate, departTime, arrivalTime, connectors);
                output.add(f);
            } else if (stringedObject.substring(0, stringedObject.indexOf(",")).equals("Bus")) {
                String[] splitVariables = stringedObject.split(",", 7);
                String company = splitVariables[1];
                int id = Integer.valueOf(splitVariables[2]);
                String departDate = splitVariables[3];
                String departTime = splitVariables[4];
                String arrivalTime = splitVariables[5];
                int stops = Integer.valueOf(splitVariables[6]);
                Bus b = new Bus(company, id, departDate, departTime, arrivalTime, stops);
                output.add(b);
            } else {
                throw new InvalidBookingException();
            }
        }
        s.close();
        return output;
    }

    /**
     * Writes the given ArrayList into given file name.
     * @param fileName String representing the name of the file.
     * @param bookings ArrayList of bookings.
     * @return boolean determining if the write was sucessfull or not.
     */
    public static boolean writeBookings(String fileName, ArrayList<Transportation> bookings) {
        try {
            FileWriter outFile = new FileWriter(fileName, true);
            PrintWriter outWriter = new PrintWriter(outFile);
            for (int i = 0; i < bookings.size(); i++) {
                outWriter.println(bookings.get(i).toString());
            }
            outWriter.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Looks for given Transportation object in file.
     * @param fileName String representing name of file.
     * @param t Transportation object to be found.
     * @return ArrayList of lines where t is found.
     * @throws FileNotFoundException Exception if the file does not exist.
     * @throws InvalidBookingException Exception when a file entry is neither bus or flight.
     */
    public static ArrayList<Integer> readBookings(String fileName, Transportation t) throws
        FileNotFoundException, InvalidBookingException {
        ArrayList<Integer> output = new ArrayList<>();
        File file = new File(fileName);
        if (!(file.exists()) || file.isFile()) {
            throw new FileNotFoundException();
        }
        ArrayList<Transportation> bookings = outputBookings(fileName);
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).equals(t)) {
                output.add(i + 1);
            }
        }
        if (output.size() == 0) {
            throw new InvalidBookingException();
        } else {
            return output;
        }
    }

    /**
     * Main Method.
     * @param args String arguments given to the compiler.
     */
    public static void main(String[] args) {
        ArrayList<Transportation> bookings = new ArrayList<>();
        Flight f = new Flight("Delta", 54321, "10-10-2022", "1400", "1800", 0);
        Bus b = new Bus("Stinger", 54321, "12-12-2022", "0400", "0800", 3);
        bookings.add(f);
        bookings.add(b);
        writeBookings("TestBooking.csv", bookings);
        try {
            ArrayList<Transportation> outputBookings = outputBookings("TestBooking.csv");
            for (int i = 0; i < outputBookings.size(); i++) {
                System.out.println(outputBookings.get(i).toString());
            }
        } catch (InvalidBookingException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        }
        Flight f2 = new Flight("Southwest", 22456, "8-10-2023", "0700", "0800", 4);
        Flight f3 = new Flight("Southwest", 22456, "8-10-2023", "0700", "0800", 4);
        bookings.add(f2);
        writeBookings("TestBooking.csv", bookings);
    }
}
