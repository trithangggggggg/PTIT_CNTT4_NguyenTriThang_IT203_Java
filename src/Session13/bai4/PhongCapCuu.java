package Session13.bai4;

import java.util.LinkedList;

public class PhongCapCuu {

    private LinkedList<String> danhSach = new LinkedList<>();

    public void themBenhNhan(String ten) {
        danhSach.addLast(ten);
    }

    public void themCapCuu(String ten) {
        danhSach.addFirst(ten);
    }

    public void khamBenh() {

        if (danhSach.isEmpty()) {
            System.out.println("Không có bệnh nhân");
            return;
        }

        String ten = danhSach.removeFirst();

        if (ten.equals("C")) {
            System.out.println("Đang cấp cứu: " + ten);
        } else {
            System.out.println("Đang khám: " + ten);
        }
    }

}
