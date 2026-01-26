package Session02.demo;

import java.util.Scanner;
//Bài 13.
//Viết chương trình tính tiền lãi gửi ngân hàng.
//Nhập vào số tiền cần gửi. Nhập số tháng gửi. Nhập gói gửi, theo các gói sau:
//        -	Gói gửi 1 tháng: Lãi suất 4%/năm
//-	Gói gửi 2 tháng: Lãi suất 4.5%/năm
//-	Gói gửi 3 tháng: Lãi suất 5%/năm
//-	Gói gửi 4 tháng: Lãi suất 5.5%/năm
//-	Gói gửi 6 tháng: Lãi suất 6%/năm
//-	Gói gửi 9 tháng: Lãi xuất 6.5%/năm
//-	Gói gửi 12 tháng: Lãi xuất 7%/năm
//Tiền lãi được cộng dồn vào tiền gốc vào cuối mỗi gói gửi.
//Những tháng thừa ra mà không đủ số tháng của gói gửi sẽ được tính lãi suất không kỳ hạn là 0.3%/năm.
//
//Hiển thị số tiền lãi thu được sau số tháng gửi ở trên, và tổng số tiền sau khi rút về.
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        double tien = sc.nextDouble();

        System.out.print("Nhap so thang: ");
        int thang = sc.nextInt();

        System.out.print("Nhap goi gui: ");
        int goiGui = sc.nextInt();

        double laiSuatNam = 0;

        switch (goiGui) {
            case 1:
                laiSuatNam = 0.04;
                break;
            case 2:
                laiSuatNam = 0.045;
                break;
            case 3:
                laiSuatNam = 0.05;
                break;
            case 4:
                laiSuatNam = 0.055;
                break;
            case 6:
                laiSuatNam = 0.06;
                break;
            case 9:
                laiSuatNam = 0.065;
                break;
            case 12:
                laiSuatNam = 0.07;
                break;
            default:
                System.out.println("Goi khong hop le!");
                return;
        }
        double tienGoc = tien;
        double tongLai = 0;

        int thangLe = thang % goiGui;
        int soKy = thang / goiGui;

        for (int i = 1;i <= soKy; i ++){
            double laiKy = tienGoc * laiSuatNam * goiGui / 12;
            tongLai += laiKy;
            tienGoc += laiKy;
        }

        if(thangLe > 0){
            double laiKhongKyHan =tienGoc * 0.003 * thangLe / 12;
            tongLai += laiKhongKyHan;
            tienGoc += laiKhongKyHan;
        }

        System.out.printf("Tien lai: %.0f VND\n", tongLai);
        System.out.printf("Tong tien sau khi rut ve: %.0f VND\n", tienGoc);

    }
}
