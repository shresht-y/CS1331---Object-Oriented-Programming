

public class runner {
    public static void main(String[] args) {
        Coin c = new Coin(20, false, 1492, "Silver");
        Coin c2 = new Coin(25.5, false, 1500, "Copper");
        Coin c3 = new Coin(25.5, false, 1500, "Copper");
        Coin c4 = new Coin(25.5, false, 1500, "Copper");
        Coin c5 = new Coin(25.5, false, 1500, "Copper");
        Coin c6 = new Coin(25.5, false, 1500, "Copper");
        Coin c7 = new Coin(25.5, false, 1500, "Copper");
        Coin c8 = new Coin(25.5, false, 1500, "Copper");
        System.out.println(c.equals(c2));

        Sugar s = new Sugar(12, 8);
        Sugar s2 = new Sugar(20, 4);
        Sugar s3 = new Sugar(1, 1);
        System.out.println(s.equals(s2));

        Ship ship = new Ship();
        ship.addCargo(c);
        ship.addCargo(c2);
        ship.addCargo(c3);
        ship.addCargo(c4);
        ship.addCargo(c5);
        ship.addCargo(c6);
        ship.addCargo(c7);
        ship.addCargo(c8);
        ship.addCargo(s);
        ship.addCargo(s2);
        ship.addCargo(s3);
        System.out.println(ship.toString());
        ship.removeCargo();
        //ship.removeCargo(s);
        Loot[] looted = ship.bePlundered();
        System.out.println(looted.length);
        for(int i = 0; i < looted.length; i++) {
            if(looted[i] == null) {
                System.out.println("null");
            } else {
                System.out.println(looted[i].toString());
            }
            
        }
        System.out.println(ship.toString());


    }
    
}
