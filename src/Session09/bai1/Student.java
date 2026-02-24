package Session09.bai1;

public class Student extends Person{
    private String studentID;
    private float Dtb;

    public Student(String name, int age, String studentID, float dtb) {
        super(name, age);
        this.studentID = studentID;
        Dtb = dtb;
    }

    public Student() {
    }

    public void displayInfo(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Dtb: " + Dtb);
    }
}
