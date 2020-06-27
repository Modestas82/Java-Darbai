package Mobile;
//Mobile objektas: model, manufacturer, price 
//(atrasti brangiausia irengini)
//(atrasti irenginius, kurie prasideda ið 'A' raidës)


public class Mobile {
	
	private String model;
	private String manufacturer;
    private int price;

    private Mobile(String model, String manufacturer , int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    private String getModel() {
        return model;
    }
    private String getManufacturer() {
        return manufacturer;
    }
    private int getPrice() {
        return price;
    }

    public String toString() {
        StringBuilder x = new StringBuilder();
        x.append("\nModel: ").append(this.getModel()).
        append("Manufacturer: ").append(this.getManufacturer()).
        append("\nPrice: ").append(this.getPrice()).append("$\n");
        return x.toString();
    }

    static Mobile[] initializeMobiles() {
        return new Mobile[]{new Mobile("Nokia", "3310", 10),
                new Mobile("Samsung", "A50", 200),
                new Mobile("Huawei", "P30", 450),
                new Mobile("Huawei", "P30 Pro", 700),
                new Mobile("HTC", "One", 100),
                new Mobile("Xiaomi", "mi9", 400),
                new Mobile("Apple", "iPhone 11 pro", 1000)};
    }

    static void findMostExpensiveMobile(Mobile[] mobiles) {
        System.out.print("Most expensive mobile is: ");
        int mostExpensive = 0;
        int mobileIndex = 0;
        for(int i =0;i<mobiles.length;i++){
            if (mobiles[i].getPrice()>mostExpensive){
                mobileIndex = i;
                mostExpensive = mobiles[i].getPrice();
            }
        }
        System.out.println(mobiles[mobileIndex].toString());
    }

    static void mobileStartsWithA(Mobile[] mobiles) {
        char letter = 'A';
        System.out.printf("Mobiles name starts with %c are:\n",letter);
        for (Mobile mobile : mobiles) {
            if (mobile.getManufacturer().indexOf(letter) == 0 || mobile.getModel().indexOf(letter) == 0) {
                System.out.println(mobile.toString());
            }
        }

    }
}
