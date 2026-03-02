package Session15.bai1;

public class Main {
    static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật triệu chứng", "01/03/2026 10:00"));
        history.addEdit(new EditAction("Thêm kết quả xét nghiệm", "01/03/2026 10:15"));
        history.addEdit(new EditAction("Chỉnh sửa đơn thuốc", "01/03/2026 10:30"));

        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLastEdit());

        System.out.println("\nThực hiện Undo:");
        history.undoAction();

        System.out.println();
        history.displayHistory();
    }
}
