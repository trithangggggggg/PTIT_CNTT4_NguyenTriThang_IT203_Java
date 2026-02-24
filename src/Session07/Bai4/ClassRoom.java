package Session07.Bai4;

public class ClassRoom {
    private String studentName;
    private static double classFund = 0;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        classFund += amount;
    }

    public static double getClassFund() {
        return classFund;
    }
}
