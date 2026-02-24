package Session02.bai3;

import java.util.Scanner;

public class Gioi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++){
            System.out.printf("Nhap so ngay tre cua sach thu %d: ", i );
            total  = total + sc.nextInt();
        }

        int phat = 5000 * total;
        System.out.printf("Tong ngay muon: %d \n", total);
        System.out.printf("Tong tien phat: %d", phat );
    }
}
