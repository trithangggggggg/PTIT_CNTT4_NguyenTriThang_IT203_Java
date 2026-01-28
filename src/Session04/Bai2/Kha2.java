package Session04.Bai2;

import java.util.Scanner;

public class Kha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mo ta sach:");
        String description = sc.nextLine();

        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 4;

            int commaIndex = description.indexOf(",", start);

            String shelfCode;
            if (commaIndex != -1) {
                shelfCode = description.substring(start, commaIndex).trim();
            } else {
                shelfCode = description.substring(start).trim();
            }
            System.out.printf("Ma vi tri ke sach: " + shelfCode);

            description = description.replace("Kệ:", "Vị trí lưu trữ:");
        } else {
            System.out.println("Khong tim thay thong tin ke sach.");
        }

        System.out.print("Mo ta moi:");
        System.out.println(description);
    }
}
