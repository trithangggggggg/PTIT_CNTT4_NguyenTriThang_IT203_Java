package Session09.bai5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> dsNhanVien = new ArrayList<>();

        dsNhanVien.add(new OfficeEmployee("Nguyen Van A", 10000000));
        dsNhanVien.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        dsNhanVien.add(new ProductionEmployee("Le Van C", 150, 30000));

        double tongLuong = 0;

        System.out.println("Danh sách lương nhân viên:");

        for (int i = 0; i < dsNhanVien.size(); i++) {
            Employee nv = dsNhanVien.get(i);
            double luong = nv.calculateSalary();

            System.out.println(
                    (i + 1) + ". " + nv.getName() +
                            " - Lương: " + luong
            );
            tongLuong += luong;
        }
        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " + tongLuong);
    }
}
