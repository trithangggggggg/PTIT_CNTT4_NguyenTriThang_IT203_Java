package Session06.Bai1;

public class Student {

    private String studentId;
    private String fullName;
    private int birthYear;
    private double avgScore;

    public Student(String studentId, String fullName, int birthYear, double avgScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.avgScore = avgScore;
    }

    public void displayInfo() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm trung bình: " + avgScore);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Student sv1 = new Student("B1234567", "Nguyen tri thang ", 2003, 8.5);
        Student sv2 = new Student("B2345678", "Nguyen tri thang 2 ", 2004, 7.8);
        sv1.displayInfo();
        sv2.displayInfo();
    }
}
