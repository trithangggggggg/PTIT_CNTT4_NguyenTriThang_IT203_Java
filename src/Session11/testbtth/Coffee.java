package Session11.testbtth;

public class Coffee extends Drink{
    public boolean hasMilk;

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = super.price;
        if (hasMilk) {
            finalPrice += 5000;
        }
        return finalPrice;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Co' Milk: " + (hasMilk ? "Co" : "Khong"));
    }
}
