package Session15.bai3;

public class Main {
    static void main(String[] args) {
        StackMedicine smc = new StackMedicine();
        smc.addMedicine(new Medicine("Tien", 1200));
        smc.addMedicine(new Medicine("Thang", 3000));
        smc.addMedicine(new Medicine("Hoa", 2000));
        System.out.println("Lay don thuoc: ");
        smc.popMedicine();
        System.out.println("Danh sach don thuoc ban dau: ");
        smc.disPlayMedicine();
        System.out.println("Danh sach don thuoc sau clear: ");
        smc.reset();
        smc.disPlayMedicine();
    }
}
