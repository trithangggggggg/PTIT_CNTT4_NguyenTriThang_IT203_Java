package Session01.bai2;

import java.util.Scanner;

public class Kha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay cham tre: ");
        int n = sc.nextInt();


        System.out.print("Nhap so luong sach muon: ");
        int m = sc.nextInt();

        float tienPhatGoc = n * m * 5000;

        float tienPhatSauDieuChinh = tienPhatGoc;
        if (n > 7 && m>= 3) {
            tienPhatSauDieuChinh = tienPhatGoc * 0.2f;
        }
        boolean blockCard = false;
        if (tienPhatSauDieuChinh > 50000){
            blockCard = true;
        } else {
            blockCard = false;
        }


        System.out.println("-----------------------------");
        System.out.println("So ngay cham tre: "+ n);
        System.out.println("Soo luong sach muon: "+m);
        System.out.println("So tien phat goc: "+ tienPhatGoc);
        System.out.println("So tien phat sau dieu chinh: "+ tienPhatSauDieuChinh);
        System.out.println("Yeu cau khoa the : " + blockCard);


    }
}
