package Session06.Bai3;

public class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }

    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Giá không hợp lệ! Giá phải > 0");
        }
    }

    public void displayInfo() {
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá bán: " + price);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Product p1 = new Product("SP01", "Chuột Gaming", 500000);

        p1.displayInfo();
        p1.setPrice(-200000);
        p1.displayInfo();
        p1.setPrice(450000);
        p1.displayInfo();
    }
}
