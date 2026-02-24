package Session07.Bai1;

public class Student {
    private String studentId;
    private String fullName;

    public static int totalStudents = 0;

    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
        totalStudents++;
    }

    public void displayInfo() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("---------------------------");
        System.out.println("Tổng số sinh vien đã tạo : " + totalStudents);
    }
}
