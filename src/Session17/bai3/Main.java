package Session17.bai3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Person> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm học viên IT");
            System.out.println("2. Thêm học viên Biz");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Xóa theo ID");
            System.out.println("5. Tìm theo tên");
            System.out.println("6. Sắp xếp theo điểm tăng dần");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    Person it = new StudentIT();
                    it.inputData(sc);
                    list.add(it);
                    break;

                case 2:
                    Person biz = new StudentBiz();
                    biz.inputData(sc);
                    list.add(biz);
                    break;

                case 3:
                    for (Person p : list) {
                        p.displayInfo();
                    }
                    break;

                case 4:
                    System.out.print("Nhập ID cần xóa: ");
                    String id = sc.nextLine();
                    list.removeIf(p -> p.id.equalsIgnoreCase(id));
                    break;

                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String name = sc.nextLine().toLowerCase();
                    for (Person p : list) {
                        if (p.name.toLowerCase().contains(name)) {
                            p.displayInfo();
                        }
                    }
                    break;

                case 6:
                    list.sort(Comparator.comparing(Person::calculatePoint));
                    System.out.println("Đã sắp xếp!");
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}
