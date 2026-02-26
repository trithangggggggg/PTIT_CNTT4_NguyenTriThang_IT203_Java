package Session13.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kha2 {
    public static List<String> locThuoc(List<String> danhSach) {

        List<String> result = new ArrayList<>();

        for (String thuoc : danhSach) {
            if (!result.contains(thuoc)) {
                result.add(thuoc);
            }
        }

        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        List<String> danhSach = new ArrayList<>();
        danhSach.add("Paracetamol");
        danhSach.add("Ibuprofen");
        danhSach.add("Panadol");
        danhSach.add("Paracetamol");
        danhSach.add("Aspirin");
        danhSach.add("Ibuprofen");

        System.out.println("Input: " + danhSach);

        List<String> ketQua = locThuoc(danhSach);

        System.out.println("Output: " + ketQua);
    }
}
