package Session06.Bai4;

public class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;

    public Employee() {
        this.employeeId = "Chưa có mã";
        this.employeeName = "Chưa có tên";
        this.salary = 0;
    }

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = 0;
    }

    public Employee(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Lương: " + salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Nguyen tri thang");
        Employee e3 = new Employee("NV02", "Vu viet tien", 15000000);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
