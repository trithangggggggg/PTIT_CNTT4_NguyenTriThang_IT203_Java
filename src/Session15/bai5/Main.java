package Session15.bai5;

public class Main {
    static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("E01", "Nguyễn Văn A", 30);
        Patient p2 = new Patient("E02", "Trần Thị B", 45);

        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        queue.addCase(case1);
        queue.addCase(case2);

        System.out.println("\n--- BẮT ĐẦU XỬ LÝ ---");

        EmergencyCase current = queue.getNextCase();

        if (current != null) {
            System.out.println("Đang xử lý: "
                    + current.getPatient());

            current.addStep(new TreatmentStep("Tiếp nhận", "08:00"));
            current.addStep(new TreatmentStep("Chẩn đoán", "08:05"));
            current.addStep(new TreatmentStep("Tiêm thuốc", "08:10"));

            System.out.println();

            current.displaySteps();

            System.out.println("\nPhát hiện sai sót → Undo");

            current.undoStep();

            System.out.println();

            current.displaySteps();
        }
    }
}
