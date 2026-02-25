package Session12.HN_KS24_CNTT4_NguyenTriThang_02.cau2;

import java.util.Scanner;

public class Phanhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Phan tu bi lap : " + arr[i]);
                    break;
                }
            }
        }
    }
}