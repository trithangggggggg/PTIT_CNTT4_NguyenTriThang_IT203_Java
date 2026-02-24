package Session10.bai2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Giant");
        System.out.println("Car brand: " + car.getBrand());
        car.move();
        System.out.println("Bicycle brand: " + bicycle.getBrand());
        bicycle.move();
    }
}
