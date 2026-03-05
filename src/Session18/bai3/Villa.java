package Session18.bai3;

public class Villa extends Property implements ITaxable {

    private double gardenArea;

    public Villa(String id, String address, double area, double basePrice, double gardenArea) {
        super(id, address, area, basePrice);
        this.gardenArea = gardenArea;
    }

    @Override
    public double totalPrice() {
        return (area + gardenArea) * basePrice;
    }

    @Override
    public double calculateTax() {
        return totalPrice() * 0.10;
    }
}