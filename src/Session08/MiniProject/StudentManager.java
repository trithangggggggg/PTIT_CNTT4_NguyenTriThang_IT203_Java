package Session08.MiniProject;

import java.util.Scanner;

public class StudentManager {

    public static Student[] students = new Student[100];
    public static int count = 0;

    // ===== THÊM SINH VIÊN =====
    public static void addNewStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ma SV: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().equalsIgnoreCase(id)) {
                System.out.println("Ma SV da ton tai!");
                return;
            }
        }

        System.out.print("Ho ten: ");
        String name = sc.nextLine();
        System.out.print("Tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Gioi tinh: ");
        String sex = sc.nextLine();
        System.out.print("Toan: ");
        double math = Double.parseDouble(sc.nextLine());
        System.out.print("Ly: ");
        double logic = Double.parseDouble(sc.nextLine());
        System.out.print("Hoa: ");
        double chem = Double.parseDouble(sc.nextLine());

        students[count++] = new Student(id, name, age, sex, math, logic, chem);
        System.out.println("Them sinh vien thanh cong!");
    }

    // ===== HIỂN THỊ =====
    public static void displayAllStudents() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    // ===== TÌM KIẾM =====
    public static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV hoac ten: ");
        String key = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().toLowerCase().equals(key)
                    || students[i].getFullName().toLowerCase().contains(key)) {
                students[i].display();
                found = true;
            }
        }

        if (!found) System.out.println("Khong tim thay!");
    }

    // ===== CẬP NHẬT =====
    public static void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().equalsIgnoreCase(id)) {
                System.out.print("Ten moi: ");
                students[i].setFullName(sc.nextLine());
                System.out.print("Tuoi moi: ");
                students[i].setAge(Integer.parseInt(sc.nextLine()));
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien!");
    }

    // ===== XÓA =====
    public static void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma SV can xoa: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getIdStudent().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null;
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    // ===== SẮP XẾP THEO ĐTB GIẢM DẦN =====
    public static void sortByAverageDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getAverageScore() < students[j + 1].getAverageScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Da sap xep theo DTB giam dan!");
    }

    // ===== THỐNG KÊ =====
    public static void statistic() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        Student max = students[0];
        Student min = students[0];

        for (int i = 1; i < count; i++) {
            if (students[i].getAverageScore() > max.getAverageScore())
                max = students[i];
            if (students[i].getAverageScore() < min.getAverageScore())
                min = students[i];
        }

        System.out.println("Sinh vien diem cao nhat:");
        max.display();
        System.out.println("Sinh vien diem thap nhat:");
        min.display();
    }
}
