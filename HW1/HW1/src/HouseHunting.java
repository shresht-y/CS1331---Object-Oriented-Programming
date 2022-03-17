public class HouseHunting {
    public static void main(String[] args) {
        House h1 = new House("Hi", 1900, 8, true);
        System.out.println(h1.getAddress());
        System.out.println(h1.getIsRenovated());
        System.out.println(h1.getNumBaths());
        System.out.println(h1.getYearBuilt());


        House[] houses = new House[]{null, new House("two", 1927, 2, true),new House("three", 2001, 7, false),null,new House("five", 1776, 12, false),new House("six", 890, 36, true)};

        Neighborhood n = new Neighborhood(houses);
        System.out.println(n.isFull());
        System.out.println(n.getNumHouses());

        n.addHouse(1, h1);

        House h2 = n.addHouse(1, new House("newHouse1", 1900, 8, true));
        House h3 = n.addHouse(3, new House("newHouse2", 1900, 8, true));

        System.out.println(n.isFull());
        n.displayNewHouses(200);
        System.out.println(n.getNumHouses());

        System.out.println(h2.getAddress());
        System.out.println(h2.getIsRenovated());
        System.out.println(h2.getNumBaths());
        System.out.println(h2.getYearBuilt());

        

    }
    
}
