package Session13.bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Xuatsac2 {

    static List<Medicine> gioThuoc = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU KÊ ĐƠN =====");
            System.out.println("1. Thêm thuốc");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ (<50000)");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");

            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themThuoc();
                    break;
                case 2:
                    dieuChinhSoLuong();
                    break;
                case 3:
                    xoaThuoc();
                    break;
                case 4:
                    inHoaDon();
                    break;
                case 5:
                    timThuocGiaRe();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // 1. Thêm thuốc
    public static void themThuoc() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : gioThuoc) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Thuốc đã có. Nhập số lượng thêm: ");
                int sl = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + sl);
                System.out.println("Đã cộng dồn số lượng.");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String ten = sc.nextLine();

        System.out.print("Nhập giá: ");
        double gia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int sl = Integer.parseInt(sc.nextLine());

        gioThuoc.add(new Medicine(id, ten, gia, sl));
        System.out.println("Đã thêm thuốc.");
    }

    // 2. Điều chỉnh số lượng
    public static void dieuChinhSoLuong() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : gioThuoc) {
            if (m.getDrugId().equals(id)) {

                System.out.print("Nhập số lượng mới: ");
                int sl = Integer.parseInt(sc.nextLine());

                if (sl == 0) {
                    gioThuoc.remove(m);
                    System.out.println("Đã xóa thuốc khỏi đơn.");
                } else {
                    m.setQuantity(sl);
                    System.out.println("Đã cập nhật số lượng.");
                }
                return;
            }
        }

        System.out.println("Không tìm thấy thuốc. Vui lòng nhập lại.");
    }

    // 3. Xóa thuốc
    public static void xoaThuoc() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        for (Medicine m : gioThuoc) {
            if (m.getDrugId().equals(id)) {
                gioThuoc.remove(m);
                System.out.println("Đã xóa thuốc.");
                return;
            }
        }

        System.out.println("ID thuốc không tồn tại.");
    }

    // 4. In hóa đơn
    public static void inHoaDon() {

        if (gioThuoc.isEmpty()) {
            System.out.println("Giỏ thuốc trống.");
            return;
        }

        double tong = 0;

        System.out.println("\n===== HÓA ĐƠN =====");

        for (Medicine m : gioThuoc) {
            System.out.println(m);
            tong += m.thanhTien();
        }

        System.out.println("TỔNG TIỀN: " + tong + " VNĐ");

        gioThuoc.clear();
        System.out.println("Đã hoàn tất và làm trống giỏ thuốc.");
    }

    // 5. Tìm thuốc giá rẻ
    public static void timThuocGiaRe() {

        boolean timThay = false;

        for (Medicine m : gioThuoc) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không có thuốc giá rẻ.");
        }
    }
}