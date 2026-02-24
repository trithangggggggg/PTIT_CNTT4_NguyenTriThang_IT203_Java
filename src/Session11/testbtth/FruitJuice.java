package Session11.testbtth;

public class FruitJuice extends Drink implements IMixable {
    private int discountPercent ; // giam gia

    public FruitJuice(int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice(){
        return price - (price * discountPercent / 100.0);
    }
    @Override
    public void mix(){
        System.out.println("Dang ep trai cay tuoi.. ");
    }

}
