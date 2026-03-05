package Session18.bai3;

public class Apartment extends Property implements ITaxable {

    private int floor;

    public Apartment(String id, String address, double area, double basePrice, int floor) {
        super(id, address, area, basePrice);
        this.floor = floor;
    }

    @Override
    public double totalPrice() {
        return area * basePrice;
    }

    @Override
    public double calculateTax() {
        if (floor >= 10)
            return totalPrice() * 0.05;
        else
            return totalPrice() * 0.02;
    }
}