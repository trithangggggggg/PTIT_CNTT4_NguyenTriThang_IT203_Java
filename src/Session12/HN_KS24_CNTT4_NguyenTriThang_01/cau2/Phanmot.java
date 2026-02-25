package Session12.HN_KS24_CNTT4_NguyenTriThang_01.cau2;

import java.util.Scanner;

public class Phanmot {
    static void main() {
        // Thống kê tần suất
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap " + n + " phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] printed = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!printed[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                System.out.println("Số " + arr[i] + " xuất hiện: " + count + " lần");
                printed[i] = true;
            }
        }
        sc.close();
    }
}
