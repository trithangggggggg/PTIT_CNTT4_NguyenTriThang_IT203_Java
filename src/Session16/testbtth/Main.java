package Session16.testbtth;

public class Main {
    static void main(String[] args) {
        ProductRepository repository = new ProductRepository();

        Product laptop1 = new ElectronicProduct("E001", "MSI", 1000.0, 24);
        Product laptop2 = new ElectronicProduct("E002", "ROG", 2000.0, 24);
        Product food1 = new FoodProduct("C001", "Banh mi", 1.0, 10);  // giảm 10%
        Product food2 = new FoodProduct("C002", "Com tam", 1.0, 5);   // giảm 5%

        repository.add(laptop1);
        repository.add(laptop2);
        repository.add(food1);
        repository.add(food2);

        System.out.println("=== PRODUCTS ===");
        for (Product p : repository.findAll()) {
            if (p != null) {
                p.displayInfo();
                System.out.println("Gia ban: " + p.calculateFinalPrice());
                System.out.println();
            }
        }


        Product foundProduct = repository.findById("E001");
        if (foundProduct != null) {
            foundProduct.displayInfo();
            System.out.println("Gia ban: " + foundProduct.calculateFinalPrice());
        } else {
            System.out.println("Product ko tim thay");
        }

        System.out.println("\nXoa product ID 'C001': "
                + repository.removeById("C001"));

        System.out.println("== tat cac product sau khi xoa ==");
        for (Product p : repository.findAll()) {
            if (p != null) {
                p.displayInfo();
                System.out.println("Gia ban: " + p.calculateFinalPrice());
                System.out.println();
            }
        }
    }
}
