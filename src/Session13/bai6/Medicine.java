package Session13.bai6;

public class Medicine {
    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;

    public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDrugId() {
        return drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double thanhTien() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return drugId + " | " + drugName +
                " | Giá: " + unitPrice +
                " | SL: " + quantity +
                " | Thành tiền: " + thanhTien();
    }

}
