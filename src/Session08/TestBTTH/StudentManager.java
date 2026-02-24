package Session08.TestBTTH;

import java.util.Scanner;

public class StudentManager {
    public static Student[] students = new Student[100];
    public static int count = 0;

    // Case 1: Them sinh vien
    public static void addNewStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ma SV: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Ma SV da ton tai!");
                return;
            }
        }

        System.out.print("Ho ten: ");
        String name = sc.nextLine();

        System.out.print("Diem: ");
        double score = sc.nextDouble();

        students[count++] = new Student(id, name, score);
        System.out.println("Them sinh vien thanh cong!");
    }

    // Case 2: Hien thi danh sach
    public static void displayStudents() {
        if (count == 0) {
            System.out.println("Danh sach sinh vien rong!");
            return;
        }

        System.out.println("\n--- DANH SACH SINH VIEN ---");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    // Case 3: Tim theo hoc lucc
    public static void searchByRank() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh/Yeu): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co hoc luc " + rank);
        }
    }

    // Case 4: Sap xep theo hoc luc giam
    public static void sortByRankDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (rankValue(students[i]) < rankValue(students[j])) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Sap xep thanh cong!");
    }

    private static int rankValue(Student s) {
        switch (s.getRank()) {
            case "Gioi": return 4;
            case "Kha": return 3;
            case "Trung Binh": return 2;
            default: return 1;
        }
    }
}
