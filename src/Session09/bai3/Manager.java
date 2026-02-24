package Session09.bai3;

public class Manager extends Employee{
    private String phongban;
    public Manager(String name, double salary, String phongban) {
        super(name, salary);
        this.phongban = phongban;
    }
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + phongban);
    }
}
