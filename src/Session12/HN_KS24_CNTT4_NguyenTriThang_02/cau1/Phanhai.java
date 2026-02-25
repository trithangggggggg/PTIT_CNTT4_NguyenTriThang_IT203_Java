package Session12.HN_KS24_CNTT4_NguyenTriThang_02.cau1;

import java.util.Scanner;

public class Phanhai {
    static void main() {
        //   Đếm tần suất xuất hiện của ký tự
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println("Loi khong nhap noi dung ");
            return;
        }
        boolean[] printed = new boolean[256];

        for (char c : input.toCharArray()) {
            if (!printed[c]) {
                int count = 0;
                for (char ch : input.toCharArray()) {
                    if (ch == c) count++;
                }
                if (c == ' ') {
                    System.out.println("  : " + count + " khoang trang");
                } else {
                    System.out.println(c + " : " + count);
                }
                printed[c] = true;
            }
        }
        sc.close();
    }
}

