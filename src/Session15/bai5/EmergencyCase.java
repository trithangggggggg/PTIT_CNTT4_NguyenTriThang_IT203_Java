package Session15.bai5;

import java.util.Stack;

public class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Đã thêm bước: " + step.getDescription());
    }

    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước nào để hoàn tác.");
            return null;
        }
        TreatmentStep removed = steps.pop();
        System.out.println("Đã hoàn tác bước: " + removed.getDescription());
        return removed;
    }

    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý.");
            return;
        }

        System.out.println("Các bước xử lý của bệnh nhân:");
        for (TreatmentStep step : steps) {
            System.out.println(step);
        }
    }
}
