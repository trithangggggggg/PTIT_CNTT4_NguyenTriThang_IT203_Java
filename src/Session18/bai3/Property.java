package Session18.bai3;

public abstract class Property {
    protected String propertyId;
    protected String address;
    protected double area;
    protected double basePrice;

    public Property(String propertyId, String address, double area, double basePrice) {
        this.propertyId = propertyId;
        this.address = address;
        this.area = area;
        this.basePrice = basePrice;
    }

    public String getPropertyId() { return propertyId; }
    public double getArea() { return area; }

    public abstract double totalPrice();
}