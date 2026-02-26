package Session13.bai5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;



public class Xuatsac1 {

    static ArrayList<BenhNhan> danhSach = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");

            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themBenhNhan();
                    break;
                case 2:
                    capNhatChanDoan();
                    break;
                case 3:
                    xuatVien();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // 1. Thêm bệnh nhân
    public static void themBenhNhan() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        for (BenhNhan bn : danhSach) {
            if (bn.getId().equals(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập họ tên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String cd = sc.nextLine();

        danhSach.add(new BenhNhan(id, ten, tuoi, cd));
        System.out.println("Thêm thành công.");
    }

    // 2. Cập nhật chẩn đoán
    public static void capNhatChanDoan() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();

        for (BenhNhan bn : danhSach) {
            if (bn.getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                bn.setChanDoan(sc.nextLine());
                System.out.println("Cập nhật thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân.");
    }

    // 3. Xuất viện
    public static void xuatVien() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = sc.nextLine();

        for (BenhNhan bn : danhSach) {
            if (bn.getId().equals(id)) {
                danhSach.remove(bn);
                System.out.println("Đã xuất viện.");
                return;
            }
        }

        System.out.println("ID không tồn tại.");
    }

    // 4. Sắp xếp
    public static void sapXep() {

        danhSach.sort(new Comparator<BenhNhan>() {
            @Override
            public int compare(BenhNhan a, BenhNhan b) {

                if (b.getTuoi() != a.getTuoi()) {
                    return b.getTuoi() - a.getTuoi();
                }

                return a.getHoTen().compareTo(b.getHoTen()); // tên A-Z
            }
        });

        System.out.println("Danh sách sau khi sắp xếp:");
        for (BenhNhan bn : danhSach) {
            System.out.println(bn);
        }
    }
}