package HN_KS24_CNTT4_NguyenTriThang_05.bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi cac danh muc (cachs nhau boi dau phay): ");
        String input = sc.nextLine();
        String[] categories = input.split(",");

        Map<String, Integer> categoryCounts = new HashMap<>();
        for (String category : categories) {
            category = category.trim().toLowerCase();
            categoryCounts.put(category, categoryCounts.getOrDefault(category, 0) + 1);
        }

        System.out.println("So luong san pham trong tung danh muc: ");
        for (String category : categoryCounts.keySet()) {
            System.out.println(category + ": " + categoryCounts.get(category));
        }

        System.out.println("Nhap danh muc muon search: ");
        String searchCategory = sc.nextLine().trim().toLowerCase();
        int count = categoryCounts.getOrDefault(searchCategory, 0);
        if (count > 0) {
            System.out.println("Search `" + searchCategory + "`: " + count );
        } else {
            System.out.println("Danh muc " + searchCategory + " khong ton tai");
        }
    }
}
