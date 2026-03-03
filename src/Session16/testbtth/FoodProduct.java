package Session16.testbtth;

public class FoodProduct extends Product {
    private int discountPercent;

    public FoodProduct(String c001, String banhMi, double v, int i) {
    }

    @Override
    public double calculateFinalPrice() {
        double finalPrice = price;
        if (discountPercent > 0) {
            finalPrice = price - (price * discountPercent / 100);
        }
        return finalPrice;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giam gia: " + discountPercent + "%");
    }
}
