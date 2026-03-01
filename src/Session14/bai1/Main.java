package Session14.bai1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        String patients[] = {"Nguyen Van A - yen bai ", "Le Thi B - thai binh", "Nguyen Van A - yen bai ","Tran Van C - ha noi"};
        Set<String> uniquePatients = new HashSet<>();
        for(String name : patients){
            uniquePatients.add(name);
        }

        System.out.println("Danh sach benh nhan goi di kham: ");
        for(String name : uniquePatients){
            System.out.println(name);
        }
    }
}
