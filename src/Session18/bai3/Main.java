package Session18.bai3;

import java.util.*;

public class Main {
    static List<Property> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm Căn hộ");
            System.out.println("2. Thêm Biệt thự");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm area > X");
            System.out.println("5. Xóa theo ID");
            System.out.println("6. Thống kê tổng doanh thu");
            System.out.println("7. Sắp xếp theo area giảm dần");
            System.out.println("8. Thoát");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Address: ");
                    String add = sc.nextLine();
                    System.out.print("Area: ");
                    double area = Double.parseDouble(sc.nextLine());
                    System.out.print("Base Price: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Floor: ");
                    int floor = Integer.parseInt(sc.nextLine());

                    list.add(new Apartment(id, add, area, price, floor));
                    break;

                case 2:
                    System.out.print("ID: ");
                    String id2 = sc.nextLine();
                    System.out.print("Address: ");
                    String add2 = sc.nextLine();
                    System.out.print("Area: ");
                    double area2 = Double.parseDouble(sc.nextLine());
                    System.out.print("Base Price: ");
                    double price2 = Double.parseDouble(sc.nextLine());
                    System.out.print("Garden Area: ");
                    double garden = Double.parseDouble(sc.nextLine());

                    list.add(new Villa(id2, add2, area2, price2, garden));
                    break;

                case 3:
                    for (Property p : list) {
                        double total = p.totalPrice() + ((ITaxable)p).calculateTax();
                        System.out.println("ID: " + p.getPropertyId() +
                                ", Area: " + p.getArea() +
                                ", Total Payment: " + total);
                    }
                    break;

                case 4:
                    System.out.print("Nhập X: ");
                    double x = Double.parseDouble(sc.nextLine());
                    for (Property p : list) {
                        if (p.getArea() > x)
                            System.out.println(p.getPropertyId());
                    }
                    break;

                case 5:
                    System.out.print("Nhập ID cần xóa: ");
                    String del = sc.nextLine();
                    list.removeIf(p -> p.getPropertyId().equalsIgnoreCase(del));
                    break;

                case 6:
                    double sum = 0;
                    for (Property p : list) {
                        sum += p.totalPrice() + ((ITaxable)p).calculateTax();
                    }
                    System.out.println("Tổng doanh thu: " + sum);
                    break;

                case 7:
                    list.sort((a, b) -> Double.compare(b.getArea(), a.getArea()));
                    System.out.println("Đã sắp xếp!");
                    break;

                case 8:
                    System.exit(0);
            }
        }
    }
}
