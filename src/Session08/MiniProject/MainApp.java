package Session08.MiniProject;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-------Quan ly sinh vien--------");
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Hien thi tat ca sinh vien");
            System.out.println("3. Tim kiem sinh vien");
            System.out.println("4. Cap nhat thong tin sinh vien");
            System.out.println("5. Xoa sinh vien");
            System.out.println("6. Tinh diem trung binh va xep loai");
            System.out.println("7. Sap xep sinh vien theo DTB");
            System.out.println("8. Thong ke");
            System.out.println("9. Thoat");
            System.out.print("Lua chon cua ban: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    StudentManager.addNewStudent();
                    break;
                case 2:
                    StudentManager.displayAllStudents();
                    break;
                case 3:
                    StudentManager.searchStudent();
                    break;
                case 4:
                    StudentManager.updateStudent();
                    break;
                case 5:
                    StudentManager.deleteStudent();
                    break;
                case 6:
                    tinhDiemTrungBinhVaXepLoai();
                    break;
                case 7:
                    StudentManager.sortByAverageDesc();
                    break;
                case 8:
                    StudentManager.statistic();
                    break;
                case 9:
                    System.out.println("Ban da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 9);
    }

    // ===== ĐTB & XẾP LOẠI =====
    public static void tinhDiemTrungBinhVaXepLoai() {
        if (StudentManager.count == 0) {
            System.out.println("Danh sach sinh vien rong!");
            return;
        }

        for (int i = 0; i < StudentManager.count; i++) {
            Student st = StudentManager.students[i];
            System.out.println(
                    "Ma SV: " + st.getIdStudent() +
                            " | Ten: " + st.getFullName() +
                            " | DTB: " + String.format("%.2f", st.getAverageScore()) +
                            " | Xep loai: " + st.getRank()
            );
        }
    }
}
