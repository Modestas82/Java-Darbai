package House;

public class HouseMain {

    public static void main(String[] args) {

        House[] houses = initializeHouses();
        printNewestHouse(houses);
        printFittedHouses(houses);
        printSmallestHouse(houses);


    }

    private static House[] initializeHouses() {
        return new House[]{new House(35.2, "Wood Green", 1990, "fitted"),
                new House(50.5, "Greenwich", 2005, "partially finished"),
                new House(70.4, "Stanford", 2020, "not finished"),
                new House(48.7, "Brownfield", 2000, "fitted"),
                new House(22.9, "Rosewood", 1999, "fitted")};
    }

    private static void printNewestHouse(House[] houses) {
        int newest = 0;
        int builtYear = 0;

        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getBuiltYear() > builtYear) {
                builtYear = houses[i].getBuiltYear();
                newest = i;
            }
        }
        System.out.println("NEWEST HOUSE IS:\n" + houses[newest].toString());
    }

    private static void printFittedHouses(House[] houses) {
        System.out.println("FITTED HOUSES ARE:");
        for (House house : houses) {
            if (house.getCondition().equals("fitted"))
                System.out.println(house.toString());
        }

    }

    private static void printSmallestHouse(House[] houses) {
        double smallestSize = 0;
        int smallestHouse = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getHouseArea() < smallestHouse) {
                smallestHouse = i;
                smallestSize = houses[i].getHouseArea();
            }
        }
        System.out.println("SMALLEST HOUSE IS:\n" + houses[smallestHouse].toString());

    }

}