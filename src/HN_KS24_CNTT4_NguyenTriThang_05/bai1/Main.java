package HN_KS24_CNTT4_NguyenTriThang_05.bai1;

import java.util.*;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so don hang n: ");
        int n = sc.nextInt();
        sc.nextLine();
        if(n <= 0) {
            System.out.println("So luong don hang khong hop le ");
            return;
        }
        System.out.println("Nhap vao phi (so thuc) cua " + n + " don hang (cach nhau boi dau cach): ");
        String input = sc.nextLine();
        String[] phiStrings = input.split(" ");
        if(phiStrings.length != n) {
            System.out.println("So luong phi khong khop voi so don hang ");
            return;
        }
        // su dung List de luu tru phi (so thuc)
        List<Integer> phiList = new java.util.ArrayList<>();

        // a) tim muc phi van chuyen thap nhat va cao nhat
        double minPrice = Double.MAX_VALUE;
        double maxPrice = Double.MIN_VALUE;

        for(String phiStr : phiStrings) {
            try {
                double phi = Double.parseDouble(phiStr);
                if(phi < 0) {
                    System.out.println("Phi van chuyen khong hop le: " + phi);
                    return;
                }
                phiList.add((int)phi);
                if(phi < minPrice) {
                    minPrice = phi;
                }
                if(phi > maxPrice) {
                    maxPrice = phi;
                }
            } catch(NumberFormatException e) {
                System.out.println("Phi van chuyen khong hop le: " + phiStr);
                return;
            }
        }
        System.out.println("Min: " + minPrice + ", Max: " + maxPrice);

        // b) tinh tong phi van chuyen va phi trung binh
        double totalPrice = 0;
        for(int phi : phiList) {
            totalPrice += phi;
        }
        double averagePrice = totalPrice / phiList.size();
        System.out.println("Average  : " + averagePrice);


        // c) hiem thi danh sach cac muc phi duy nhat theo thu tu giam dan ko trung
        System.out.println("c): ");
        Set<Integer> uniquePrices = new HashSet<>(phiList);
        List<Integer> uniquePriceList = new ArrayList<>(uniquePrices);
        for(int i = 0; i < uniquePriceList.size() - 1; i++) {
            for(int j = 0; j < uniquePriceList.size() - i - 1; j++) {
                if(uniquePriceList.get(j) < uniquePriceList.get(j + 1)) {
                    int temp = uniquePriceList.get(j);
                    uniquePriceList.set(j, uniquePriceList.get(j + 1));
                    uniquePriceList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Unique (desc): " + uniquePriceList);

        // d) dem so luong don hang > 50
        int express = 0;
        for(int phi : phiList) {
            if(phi >= 50) {
                express++;
            }
        }
        System.out.println("express : " + express);
    }
}
