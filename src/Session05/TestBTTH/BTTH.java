package Session05.TestBTTH;

import java.util.Scanner;

public class BTTH {
    static String[] mssvList = new String[100];
    static int count = 0;

    static final String MSSV_REGEX = "^B\\d{7}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------");
            System.out.println("-----Quan li ma so sinh vien-----");
            System.out.println("1. Hien thi danh sach sinh vien");
            System.out.println("2. Them moi sinh vien ");
            System.out.println("3. Cap nhat vi tri index sinh vien");
            System.out.println("4. Xoa sinh vien theo ma so");
            System.out.println("5. Tim kiem sinh vien theo MSSV");
            System.out.println("6. Thoat");
            System.out.println("----------------------------------");
            System.out.print("Nhap lua chon cua ban (1-6): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    hienThi();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Moi ban nhap ma so sinh vien: ");
                    String mssv = sc.nextLine();
                    themMoi(mssv);
                    break;
                case 3:
                    System.out.print("Moi ban nhap vi tri can cap nhat: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Moi ban nhap ma so sinh vien moi: ");
                    String newMssv = sc.nextLine();
                    capNhat(index, newMssv);
                    break;
                case 4:
                    System.out.print("Moi bann nhap ma so sinh vien can xoa: ");
                    String delMssv = sc.nextLine();
                    xoaSinhVien(delMssv);
                    break;
                case 5:
                    System.out.print("Moi ban nhap ma so sinh vien can tim kiem: ");
                    String searchMssv = sc.nextLine();
                    timKiemSinhVien(searchMssv);
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 6);
    }

    static void hienThi() {
        if (count == 0) {
            System.out.println("Danh sach sinh vien rong ");
            return;
        }
        System.out.println("Danh sach sinh vien : ");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + mssvList[i]);
        }
    }

    static void themMoi(String mssv) {
        if (mssv == null || !mssv.matches(MSSV_REGEX)) {
            System.out.println("Ma so sinh vien khong hop le (Bat dau bang B va co 7 chu so )");
        } else {
            mssvList[count] = mssv;
            count++;
            System.out.println("Them moi sinh vien thanh cong ");
        }
    }

    static  void capNhat(int index, String newMssv) {
        if (index < 0 || index >= count ){
            System.out.println("Vi tri khong hop le ");

        } else if (newMssv == null || !newMssv.matches(MSSV_REGEX)) {
            System.out.println("Ma so sinh vien khong hop le (Bat dau bang B va co 7 chu so )");
        } else {
            mssvList[index] = newMssv;
            System.out.println("Cap nhat sinh vien thanh cong ");
        }
    }
    static void xoaSinhVien(String delMssv) {
        if (delMssv == null || !delMssv.matches(MSSV_REGEX)) {
            System.out.println("Ma so sinh vien khong hop le (Bat dau bang B va co 7 chu so )");
            return;
        }
        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].equals(delMssv)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Khong tim thay sinh vien can xoa");
            return;
        }

        for (int i = pos; i < count - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }
        mssvList[count - 1] = null;
        count--;
        System.out.println("Xoa sinh vien thanh cong");
    }
    static void timKiemSinhVien(String searchMssv) {
        if (searchMssv == null || !searchMssv.matches(MSSV_REGEX)) {
            System.out.println("Ma so sinh vien khong hop le (Bat dau bang B va co 7 chu so )");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (mssvList[i].equals(searchMssv)) {
                System.out.println("Tim thay sinh vien tai vi tri: " + i);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien can tim kiem");
    }
}
