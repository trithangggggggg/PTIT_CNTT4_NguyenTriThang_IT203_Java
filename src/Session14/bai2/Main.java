package Session14.bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Map<String, String> thuoc = new HashMap<>();
        thuoc.put("T01", "Paracetamol");
        thuoc.put("T02", "Ibuprofen");
        thuoc.put("T03", "Amoxicillin");
        thuoc.put("T04", "Aspirin");
        thuoc.put("T05", "Vitamin C");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc cần tìm: ");
        String maThuoc = sc.nextLine();

        if(thuoc.containsKey(maThuoc)){
            System.out.println("Tên thuốc: " + thuoc.get(maThuoc));
        } else {
            System.out.println("Không tìm thấy thuốc với mã: " + maThuoc);
        }
    }
}
