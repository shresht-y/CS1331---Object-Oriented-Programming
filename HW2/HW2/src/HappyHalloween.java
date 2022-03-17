/**
 * Driver class that contains the main method.
 * Designed to test the functionality of Ghost, Witch, and BlackCat classes.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class HappyHalloween {
    /**
     * Main method that creates BlackCat, Witch, and Ghost objects and tests their methods.
     * @param args arguments giving to the command line to execute java code.
     */
    public static void main(String[] args) {
        BlackCat c1 = new BlackCat("Jayadeep", true);
        BlackCat c2 = new BlackCat("Ashvin", false);
        Witch w1 = new Witch("Krish", "Boom", c1);
        Witch w2 = new Witch("Samarth", "Smith Dorm", 20, "RAP", c2);
        Ghost g1 = new Ghost("Shresht", "Oakmont", 37, 9);
        Ghost g2 = new Ghost("Shreya", "White Hawk", 10, 1);
        Ghost g3 = new Ghost(g1);
        Witch w3 = new Witch(w2);
        c1.meow();
        w2.setName("Hello");
        System.out.println(w3.getName());
        System.out.println(w2.getName());
        g1.setName("George");
        System.out.println(g3.getName());
        System.out.println(g1.getName());
        w1.seekCandy(1);
        w2.seekCandy(2);
        g1.seekCandy(3);
        g2.seekCandy(4);
        System.out.println(g2.getTotalCandy());
        w2.castSpell();
        System.out.println(g2.getTotalCandy());
    }
}