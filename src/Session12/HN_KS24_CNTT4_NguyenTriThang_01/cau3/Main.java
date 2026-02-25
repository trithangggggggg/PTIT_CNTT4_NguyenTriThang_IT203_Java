package Session12.HN_KS24_CNTT4_NguyenTriThang_01.cau3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao N phan tu (arr A): ");
        int n = sc.nextInt();
        int arrA[] = new int[n];
        System.out.println("Nhap vao cac phan tu cua arr A: ");
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        System.out.println("Nhap vao M phan tu (arr B): ");
        int m = sc.nextInt();
        int arrB[] = new int[m];
        System.out.println("Nhap vao cac phan tu cua arr B: ");
        for (int i = 0; i < m; i++) {
            arrB[i] = sc.nextInt();
        }

        if (m > n) {
            System.out.println("Arr B khong la mang con cua arr A");
            sc.close();
            return;
        }
        boolean isSubArray = false;
        for (int i = 0; i <= n - m; i++) {

            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (arrA[i + j] != arrB[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                isSubArray = true;
                break;
            }
        }
        if (isSubArray) {
            System.out.println("Arr B la mang con cua arr A");
        } else {
            System.out.println("Arr B khong la mang con cua arr A");
        }
        sc.close();
    }
}