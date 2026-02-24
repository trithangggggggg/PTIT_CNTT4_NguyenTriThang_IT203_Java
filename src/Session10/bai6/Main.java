package Session10.bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 1200));
        products.add(new Product("Camera", 900));

        Collections.sort(products, new Comparator<Product>() {
            private int compareCount = 0;

            @Override
            public int compare(Product p1, Product p2) {
                compareCount++;
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("=== Sắp xếp theo giá tăng dần (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("\n=== Sắp xếp theo tên A-Z (Lambda) ===");
        products.forEach(System.out::println);
    }
}

