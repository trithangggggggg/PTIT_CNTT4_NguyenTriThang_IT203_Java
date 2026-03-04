package Session16.MiniPrj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PetManager petManager = new PetManager();
        CustomerManager customerManager = new CustomerManager();
        SpaService spaService = new SpaService();
        ActivityLog activityLog = new ActivityLog();

        int choice;

        do {
            System.out.println("\n========= PET KINGDOM =========");
            System.out.println("1. Thêm thú cưng");
            System.out.println("2. Hiển thị danh sách thú cưng");
            System.out.println("3. Tìm thú cưng theo ID");
            System.out.println("4. Bán (xóa) thú cưng");
            System.out.println("5. Đăng ký khách hàng");
            System.out.println("6. Tìm khách hàng theo ID");
            System.out.println("7. Hiển thị khách hàng");
            System.out.println("8. Đưa thú cưng vào Spa");
            System.out.println("9. Phục vụ thú cưng tiếp theo");
            System.out.println("10. Xem thú cưng tiếp theo (Spa)");
            System.out.println("11. Hiển thị hàng chờ Spa");
            System.out.println("12. Undo thao tác");
            System.out.println("13. Xem thao tác gần nhất");
            System.out.println("14. Hiển thị toàn bộ nhật ký");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                // ===== PET =====
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập loài: ");
                    String species = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = Double.parseDouble(sc.nextLine());

                    Pet pet = new Pet(id, name, species, price);
                    petManager.addPet(pet);
                    activityLog.logAction("Thêm thú cưng: " + name);
                    break;

                case 2:
                    petManager.displayAll();
                    break;

                case 3:
                    System.out.print("Nhập ID cần tìm: ");
                    String searchId = sc.nextLine();
                    Pet foundPet = petManager.findById(searchId);

                    if (foundPet != null) {
                        System.out.println(foundPet);
                    } else {
                        System.out.println("Không tìm thấy thú cưng.");
                    }
                    break;

                case 4:
                    System.out.print("Nhập ID cần bán: ");
                    String removeId = sc.nextLine();
                    petManager.removeById(removeId);
                    activityLog.logAction("Xóa thú cưng ID: " + removeId);
                    break;

                // ===== CUSTOMER =====
                case 5:
                    System.out.print("Nhập ID khách hàng: ");
                    String cusId = sc.nextLine();
                    System.out.print("Nhập tên khách hàng: ");
                    String cusName = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = sc.nextLine();

                    Customer customer = new Customer(cusId, cusName, phone);
                    customerManager.register(customer);
                    activityLog.logAction("Đăng ký khách hàng: " + cusName);
                    break;

                case 6:
                    System.out.print("Nhập ID khách hàng cần tìm: ");
                    String findCusId = sc.nextLine();
                    Customer foundCus = customerManager.findById(findCusId);

                    if (foundCus != null) {
                        System.out.println(foundCus);
                    } else {
                        System.out.println("Không tìm thấy khách hàng.");
                    }
                    break;

                case 7:
                    customerManager.displayCustomer();
                    break;

                // ===== SPA =====
                case 8:
                    System.out.print("Nhập ID thú cưng đưa vào Spa: ");
                    String spaId = sc.nextLine();
                    Pet spaPet = petManager.findById(spaId);

                    if (spaPet != null) {
                        spaService.addToQueue(spaPet);
                        activityLog.logAction("Đưa vào Spa: " + spaPet.getName());
                    } else {
                        System.out.println("Không tìm thấy thú cưng trong kho.");
                    }
                    break;

                case 9:
                    spaService.serveNext();
                    activityLog.logAction("Phục vụ 1 thú cưng Spa");
                    break;

                case 10:
                    spaService.viewNext();
                    break;

                case 11:
                    spaService.displayQueue();
                    break;

                // ===== LOG =====
                case 12:
                    activityLog.undo();
                    break;

                case 13:
                    activityLog.viewRecent();
                    break;

                case 14:
                    activityLog.displayAll();
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 0);

        sc.close();
    }
}
